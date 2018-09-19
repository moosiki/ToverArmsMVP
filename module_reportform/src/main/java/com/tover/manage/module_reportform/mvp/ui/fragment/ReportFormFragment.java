package com.tover.manage.module_reportform.mvp.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.core.app.data.AppConstants;
import com.tover.manage.core.di.module.CompanyModule;
import com.tover.manage.core.mvp.Contract.CompanyContract;
import com.tover.manage.core.mvp.model.CompanyModel;
import com.tover.manage.core.mvp.presenter.CompanyPresenter;
import com.tover.manage.module_reportform.R;
import com.tover.manage.module_reportform.R2;
import com.tover.manage.module_reportform.di.component.DaggerReportFormComponent;
import com.tover.manage.module_reportform.mvp.contract.ReportFormContract;
import com.tover.manage.module_reportform.mvp.presenter.ReportFormPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = RouterHub.REPORT_MAINFRAGMENT,name = "报表主页")
public class ReportFormFragment extends BaseFragment<ReportFormPresenter>
        implements ReportFormContract.View,CompanyContract.View{

    @BindView(R2.id.report_button)
    Button testButton;

    @Inject
    CompanyPresenter companyPresenter;

    @Override
    public void setupFragmentComponent(@NonNull AppComponent appComponent) {
       /* DaggerReportFormComponent
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);*/
       DaggerReportFormComponent
               .builder()
               .appComponent(appComponent)
               .companyModule(new CompanyModule(this))
               .view(this)
               .build()
               .inject(this);

    }

    @Override
    public View initView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.report_fragment_mainfrag,container,false);
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
    }

    @OnClick(R2.id.report_button)
    public void getProject(){
        companyPresenter.getProject("", AppConstants.getConstants(getActivity(),AppConstants.EMPLOYEEID).toString());
    }

    @Override
    public void setData(@Nullable Object data) {

    }

    @Override
    public void getProjectSuccess() {
        Toast.makeText(getActivity(),"success",Toast.LENGTH_LONG).show();
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
