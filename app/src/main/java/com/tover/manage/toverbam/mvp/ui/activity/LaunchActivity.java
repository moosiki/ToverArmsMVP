package com.tover.manage.toverbam.mvp.ui.activity;

import android.Manifest;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.commonsdk.utils.Utils;
import com.tover.manage.core.app.data.AppConstants;
import com.tover.manage.toverbam.R;
import com.tover.manage.toverbam.app.utils.mipush.MiPushRegisterHelper;
import com.xiaomi.mipush.sdk.MiPushClient;

import java.util.Set;

public class LaunchActivity extends BaseActivity{

    //需要申请的权限
    private String[] perms = new String[]{
            Manifest.permission.INTERNET,
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.ACCESS_WIFI_STATE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CALL_PHONE,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.ACCESS_FINE_LOCATION,
    };

    private Handler delayedHandler = new Handler();
    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_launch;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        //获取运行时权限
        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions.requestEachCombined(perms);
        if (AppConstants.getConstants(this,AppConstants.REGID) == null){
            if (MiPushRegisterHelper.shouldInit(this)){
                MiPushClient.registerPush(this, AppConstants.getAppId(),AppConstants.getAppKey());
            }
        }
        delayedHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Utils.navigation(LaunchActivity.this, RouterHub.LOGIN_HOMEACTIVITY);
                finish();
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

            }
        },2000);

    }
}
