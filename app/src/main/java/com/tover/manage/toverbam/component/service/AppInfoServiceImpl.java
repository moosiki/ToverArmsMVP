package com.tover.manage.toverbam.component.service;


import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.tover.manage.commonsdk.core.RouterHub;
import com.tover.manage.commonservice.app.service.AppInfoService;

/**
 * Author by Mryang.
 * Date on 2018/9/12.
 * Description 宿主app向外提供信息服务的接口实现类
 */
@Route(path = RouterHub.APP_SERVICE_APPINFOSERVICE,name = "APP信息服务")
public class AppInfoServiceImpl implements AppInfoService {
    private Context mContext;

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
