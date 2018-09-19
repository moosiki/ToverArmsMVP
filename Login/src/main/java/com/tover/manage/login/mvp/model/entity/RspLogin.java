package com.tover.manage.login.mvp.model.entity;

import java.util.Set;

/**
 * Author by Mryang.
 * Date on 2018/9/12.
 * Description 登陆接口返回的数据模型
 */
public class RspLogin {
    private String employId;
    private Set<String> rules;//角色权限集合

    public RspLogin() {
    }
    public String getEmployId() {
        return employId;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    public Set<String> getRules() {
        return rules;
    }

    public void setRules(Set<String> rules) {
        this.rules = rules;
    }
}
