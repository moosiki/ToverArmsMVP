package com.tover.manage.login.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.tover.manage.login.di.module.LoginHomeModule;
import com.tover.manage.login.mvp.contract.LoginContract;
import com.tover.manage.login.mvp.ui.activity.LoginActivity;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(modules = LoginHomeModule.class, dependencies = AppComponent.class)
public interface LoginHomeComponent {
    void inject(LoginActivity activity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        LoginHomeComponent.Builder view(LoginContract.View view);
        LoginHomeComponent.Builder appComponent(AppComponent appComponent);
        LoginHomeComponent build();
    }

}
