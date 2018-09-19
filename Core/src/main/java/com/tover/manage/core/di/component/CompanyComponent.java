package com.tover.manage.core.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.tover.manage.core.di.module.CompanyModule;
import com.tover.manage.core.mvp.Contract.CompanyContract;

import dagger.BindsInstance;
import dagger.Component;


@ActivityScope
@Component(modules = CompanyModule.class,dependencies = AppComponent.class)
public interface CompanyComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        CompanyComponent.Builder view(CompanyContract.View view);
        CompanyComponent.Builder appComponent(AppComponent appComponent);
        CompanyComponent.Builder companyModule(CompanyModule cm);
        CompanyComponent build();
    }
}
