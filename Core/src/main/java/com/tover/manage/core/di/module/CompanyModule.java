package com.tover.manage.core.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.tover.manage.core.mvp.Contract.CompanyContract;
import com.tover.manage.core.mvp.model.CompanyModel;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class CompanyModule {

    private CompanyContract.View view;

    public CompanyModule(CompanyContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    CompanyContract.View provideCompanyView(){
        return this.view;
    }

    @ActivityScope
    @Provides
    CompanyContract.Model provideCompanyModel(CompanyModel model){
        return model;
    }
}
