package com.tover.manage.core.mvp.model.api.service;

import com.tover.manage.commonsdk.http.RspModel;
import com.tover.manage.core.mvp.model.entity.Project;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 获取公司信息的网络请求接口
 */
public interface CompanyService {

    /**
     *根据关键字获取项目
     * @param searchName 关键字
     * @return 携带数据的模型
     */
    @GET("Androiditem/androidblur")
    Observable<RspModel<Project>> getProject(@Query("projectName") String searchName,
                                             @Query("employId") String employeeId);
}
