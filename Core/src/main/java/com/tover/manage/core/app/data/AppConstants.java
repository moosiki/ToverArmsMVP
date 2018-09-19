package com.tover.manage.core.app.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Author by Mryang.
 * Date on 2018/9/12.
 * Description 存放APP的一些常量
 */
public class AppConstants {

    public static final String REGID = "regId";
    public static final String TOKEN = "token";

    //登录信息常量
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String EMPLOYEEID = "employeeId";

    private static String username;
    private static String password;
    private static String employeeId;

    private static String regId;  //注册小米推送返回的唯一ID
    private static String token;  //注册华为推送返回的唯一值

    //注册小米推送用的常量
    private static final String APP_ID = "2882303761517862705";
    private static final String APP_KEY = "5861786233705";


    /**
     * 存储信息到xml文件中
     * @param context 上下文
     * @param TAG  数据常量的标签
     * @param value 存储的值
     */
    public static void savaConstants(Context context, String TAG, String value) {
        SharedPreferences sp = context.getSharedPreferences(AppConstants.class.getName(), Context.MODE_PRIVATE);
        sp.edit()
                .putString(TAG, value)
                .apply();
    }

    /**
     * 获取数据
     * @param context 上下文
     * @param TAG 数据常量的标签
     * @return  获取的值
     */
    public static Object getConstants(Context context,String TAG){
        SharedPreferences sp = context.getSharedPreferences(AppConstants.class.getName(), Context.MODE_PRIVATE);
        return sp.getAll().get(TAG);
    }

    public static String getAppId() {
        return APP_ID;
    }

    public static String getAppKey() {
        return APP_KEY;
    }
}
