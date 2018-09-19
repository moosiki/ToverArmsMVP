package com.tover.manage.login.mvp.contract;

import android.app.Activity;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.login.mvp.model.entity.ReqLogin;
import com.tover.manage.login.mvp.model.entity.RspLogin;

import io.reactivex.Observable;

public interface LoginContract {

    interface View extends IView{
        void showLogin();
        void loginSuccess(RspLogin model);
        void loginFalse();
        Activity getActivity();
    }

    interface Model extends IModel{
        Observable<RspModel<RspLogin>> login(ReqLogin reqLogin);
    }

}
