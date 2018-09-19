package com.tover.manage.module_reportform.di.module;

import com.jess.arms.di.scope.ActivityScope;
import com.tover.manage.module_reportform.mvp.contract.ReportFormContract;
import com.tover.manage.module_reportform.mvp.model.ReportFormModel;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ReportFormModule {
    @Binds
    abstract ReportFormContract.Model bindLoginModel(ReportFormModel model);
}
