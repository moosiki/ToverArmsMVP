package com.tover.manage.login.mvp.model;

import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;
import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.login.mvp.contract.LoginContract;
import com.tover.manage.login.mvp.model.api.service.LoginService;
import com.tover.manage.login.mvp.model.entity.ReqLogin;
import com.tover.manage.login.mvp.model.entity.RspLogin;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 登录模型类，用于获取数据
 */
public class LoginModel extends BaseModel implements LoginContract.Model{

    @Inject
    public LoginModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public Observable<RspModel<RspLogin>> login(ReqLogin reqLogin) {
        return mRepositoryManager
                .obtainRetrofitService(LoginService.class)
                .login(reqLogin);
    }
}
