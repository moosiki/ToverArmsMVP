package com.tover.manage.module_cost.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.module_cost.R;
import com.tover.manage.module_cost.R2;
import com.tover.manage.module_cost.mvp.ui.fragment.CostFragment;

import butterknife.BindView;

@Route(path = RouterHub.COST_ACTIVITY, name = "成本组件")
public class CostActivity extends BaseActivity{


    FragmentManager fragmentManager;
    FragmentTransaction transaction;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.cost_activity_report_form;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R2.id.cost_fl_contain_fragment,new CostFragment());
        transaction.commit();
    }
}
