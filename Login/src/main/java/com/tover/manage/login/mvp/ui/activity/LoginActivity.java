package com.tover.manage.login.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.commonsdk.utils.Utils;
import com.tover.manage.commonservice.app.service.AppInfoService;
import com.tover.manage.core.app.data.AppConstants;
import com.tover.manage.login.R;
import com.tover.manage.login.R2;
import com.tover.manage.login.di.component.DaggerLoginHomeComponent;
import com.tover.manage.login.mvp.contract.LoginContract;
import com.tover.manage.login.mvp.model.entity.ReqLogin;
import com.tover.manage.login.mvp.model.entity.RspLogin;
import com.tover.manage.login.mvp.presenter.LoginPresenter;
import com.tover.manage.login.mvp.ui.dialog.LoginDialog;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Author by Mryang.
 * Date on 2018/9/11.
 * Description 登陆逻辑Activity
 */
@Route(path = RouterHub.LOGIN_HOMEACTIVITY,name = "登陆主页")
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View{

    @BindView(R2.id.btn_login_mainactivity_login)
    Button loginBtn;
    @BindView(R2.id.et_login_mainactivity_username)
    EditText inputuserName;
    @BindView(R2.id.et_login_mainactivity_password)
    EditText inputpassword;
    @BindView(R2.id.login_rb_choose_autologin)
    RadioButton isAutoLogin;
    @Autowired(name = RouterHub.APP_SERVICE_APPINFOSERVICE)
    AppInfoService appInfoService;

    LoginDialog dialog;
    String userName;
    String passWord;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerLoginHomeComponent
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppConstants.getConstants(this,AppConstants.USERNAME) != null){
            userName = AppConstants.getConstants(this,AppConstants.USERNAME).toString();
            passWord = AppConstants.getConstants(this,AppConstants.PASSWORD).toString();
            mPresenter.login(new ReqLogin(userName,passWord));
        }
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.login_activity_login;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLogin() {

    }

    @OnClick(R2.id.btn_login_mainactivity_login)
    public void login(){
        userName = inputuserName.getText().toString().trim();
        passWord = inputpassword.getText().toString().trim();
        if(TextUtils.isEmpty(userName)|| TextUtils.isEmpty(passWord)) {
            Toast.makeText(this,"账号密码不能为空",Toast.LENGTH_LONG).show();
            return;
        }
        ReqLogin reqLogin = new ReqLogin(userName,passWord);
        mPresenter.login(reqLogin);
    }

    @Override
    public void loginSuccess(RspLogin model) {
        Toast.makeText(this,"登录成功！",Toast.LENGTH_LONG).show();
        //存储用户名与密码,用户id
        if (isAutoLogin.isChecked()){
            AppConstants.savaConstants(this, AppConstants.USERNAME,userName);
            AppConstants.savaConstants(this,AppConstants.PASSWORD,passWord);
            AppConstants.savaConstants(this,AppConstants.EMPLOYEEID,model.getEmployId());
        }
        Utils.navigation(LoginActivity.this, RouterHub.APP_MAINACTIVITY);
        finish();
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }

    @Override
    public void loginFalse() {
        Toast.makeText(this,"登录失败！",Toast.LENGTH_LONG).show();
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void showLoading() {
        dialog = new LoginDialog(this,R.style.login_loading_dialog_style);
        dialog.show();
    }

    @Override
    public void hideLoading() {
        dialog.dismiss();
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
