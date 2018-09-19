package com.tover.manage.module_reportform.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.core.app.data.AppConstants;
import com.tover.manage.core.di.module.CompanyModule;
import com.tover.manage.core.mvp.Contract.CompanyContract;
import com.tover.manage.core.mvp.presenter.CompanyPresenter;
import com.tover.manage.module_reportform.R;
import com.tover.manage.module_reportform.R2;
import com.tover.manage.module_reportform.di.component.DaggerReportFormComponent;
import com.tover.manage.module_reportform.mvp.contract.ReportFormContract;
import com.tover.manage.module_reportform.mvp.presenter.ReportFormPresenter;
import com.tover.manage.module_reportform.mvp.ui.fragment.ReportFormFragment;

import javax.inject.Inject;

import butterknife.BindView;

@Route(path = RouterHub.REPORT_ACTIVITY,name = "报表组件")
public class ReportFormActivity extends BaseActivity<ReportFormPresenter>
        implements ReportFormContract.View,CompanyContract.View {

    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    @Inject
    CompanyPresenter companyPresenter;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerReportFormComponent
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.report_activity_report_form;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R2.id.report_fl_contain_fragment,new ReportFormFragment());
        transaction.commit();
        companyPresenter.getProject("", AppConstants.getConstants(this,AppConstants.EMPLOYEEID).toString());
    }

    @Override
    public void getProjectSuccess() {
        Toast.makeText(this,"success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {

    }

    @Override
    public void launchActivity(@NonNull Intent intent) {

    }

    @Override
    public void killMyself() {

    }
}
