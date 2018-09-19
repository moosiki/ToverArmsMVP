package com.tover.manage.login.mvp.model.api.service;

import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.login.mvp.model.entity.ReqLogin;
import com.tover.manage.login.mvp.model.entity.RspLogin;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Author by Mryang.
 * Date on 2018/9/12.
 * Description 登陆组件的网络请求接口
 */
public interface LoginService {
    /**
     *    登录接口
     *
     * @return  登陆成功返回的数据
     */
    @POST("Androidlogin/androidlogin")
    Observable<RspModel<RspLogin>> login(@Body ReqLogin reqLogin);
}
