package com.tover.manage.login.mvp.presenter;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.LogUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.commonservice.app.service.AppInfoService;
import com.tover.manage.core.app.data.AppConstants;
import com.tover.manage.login.mvp.contract.LoginContract;
import com.tover.manage.login.mvp.model.entity.ReqLogin;
import com.tover.manage.login.mvp.model.entity.RspLogin;
import com.tover.manage.login.utils.Rom;

import java.util.logging.Logger;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model,LoginContract.View>{
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    AppManager mAppManager;
    @Inject
    Application mApplication;
    @Autowired(name = RouterHub.APP_SERVICE_APPINFOSERVICE)
    AppInfoService appInfoService;

    @Inject
    public LoginPresenter(LoginContract.Model model, LoginContract.View rootView) {
        super(model, rootView);
        ARouter.getInstance().inject(this);
    }

    public void login(ReqLogin reqLogin){
        if (Rom.isEmui()) {    //华为手机类型
            reqLogin.setType(2);
            reqLogin.setToken("000");  //设置token
            reqLogin.setRegId("000");  //设置regId
        } else {   //小米或其它手机类型
            reqLogin.setType(1);
            reqLogin.setToken("000");  //设置token
            if (appInfoService != null){         //设置regId
                LogUtils.debugInfo("service in");
                reqLogin.setRegId(AppConstants.getConstants(mApplication,AppConstants.REGID).toString());
            }else {
                LogUtils.debugInfo("noservice");
                reqLogin.setRegId("000");
            }

        }

        mModel.login(reqLogin)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(disposable -> {
                    mRootView.showLoading();
                })
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() ->{
                    mRootView.hideLoading();
                })
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<RspModel<RspLogin>>(mErrorHandler) {
                    @Override
                    public void onNext(RspModel<RspLogin> rspLoginRspModel) {
                        if (rspLoginRspModel.success()){
                            mRootView.loginSuccess(rspLoginRspModel.getData());
                        }else {
                            mRootView.loginFalse();
                        }
                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mApplication = null;
    }
}
