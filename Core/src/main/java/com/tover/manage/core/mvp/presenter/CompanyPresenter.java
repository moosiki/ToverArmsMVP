package com.tover.manage.core.mvp.presenter;

import android.app.Application;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.utils.RxLifecycleUtils;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.core.mvp.Contract.CompanyContract;
import com.tover.manage.core.mvp.model.entity.Project;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

@ActivityScope
public class CompanyPresenter extends BasePresenter<CompanyContract.Model,CompanyContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    AppManager mAppManager;
    @Inject
    Application mApplication;

    @Inject
    public CompanyPresenter(CompanyContract.Model model, CompanyContract.View rootView, RxErrorHandler mErrorHandler) {
        super(model, rootView);
        this.mErrorHandler = mErrorHandler;
    }

    public void getProject(String searchName,String employeeId){
        mModel.getProject(searchName,employeeId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<RspModel<Project>>(mErrorHandler) {
                    @Override
                    public void onNext(RspModel<Project> projectRspModel) {
                        if (projectRspModel != null){
                            mRootView.getProjectSuccess();
                        }
                    }
                });;
    }
}
