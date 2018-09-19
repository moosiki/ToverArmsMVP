package com.tover.manage.module_reportform.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.tover.manage.core.di.component.CompanyComponent;
import com.tover.manage.core.di.module.CompanyModule;
import com.tover.manage.module_reportform.di.module.ReportFormModule;
import com.tover.manage.module_reportform.mvp.contract.ReportFormContract;
import com.tover.manage.module_reportform.mvp.ui.activity.ReportFormActivity;
import com.tover.manage.module_reportform.mvp.ui.fragment.ReportFormFragment;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(modules = {ReportFormModule.class, CompanyModule.class},dependencies = AppComponent.class)
public interface ReportFormComponent {

    void inject(ReportFormActivity activity);

    void inject(ReportFormFragment fragment);

    @Component.Builder
    interface Builder{
        @BindsInstance
        ReportFormComponent.Builder view(ReportFormContract.View view);
        ReportFormComponent.Builder appComponent(AppComponent appComponent);
        ReportFormComponent.Builder companyModule(CompanyModule cm);
        ReportFormComponent build();
    }
}
