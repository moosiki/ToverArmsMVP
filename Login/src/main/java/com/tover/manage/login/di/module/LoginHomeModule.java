package com.tover.manage.login.di.module;

import com.tover.manage.login.mvp.contract.LoginContract;
import com.tover.manage.login.mvp.model.LoginModel;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginHomeModule {
    @Binds
    abstract LoginContract.Model bindLoginModel(LoginModel model);
}
