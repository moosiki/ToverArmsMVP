package com.tover.manage.login.mvp.model.entity;

/**
 * Author by Mryang.
 * Date on 2018/9/11.
 * Description 登录接口需要的请求实体类
 */
public class ReqLogin {
    private String username;
    private String password;
    private int type;     //手机类型
    private String token;  //华为手机标记
    private String regId;  //小米推送服务唯一标识

    public ReqLogin() {
    }

    public ReqLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ReqLogin(String username, String password, int type, String token, String regId) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.token = token;
        this.regId = regId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }
}
