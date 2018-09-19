package com.tover.manage.core.mvp.model.entity;

import java.io.Serializable;

/**
 * Author by Mryang.
 * Date on 2018/9/17.
 * Description 员工实体类
 */
public class Employee implements Serializable{
    private static final long serialVersionUID = -2953164518080955573L;

    private String eplyName;
    private String applyUserId;
    private String employId;

    public Employee() {
    }

    public Employee(String eplyName) {
        this.eplyName = eplyName;
    }

    public Employee(String eplyName, String applyUserId, String employId) {
        this.eplyName = eplyName;
        this.applyUserId = applyUserId;
        this.employId = employId;
    }

    public String getEplyName() {
        return eplyName;
    }

    public void setEplyName(String eplyName) {
        this.eplyName = eplyName;
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getEmployId() {
        return employId;
    }

    public void setEmployId(String employId) {
        this.employId = employId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eplyName='" + eplyName + '\'' +
                ", applyUserId='" + applyUserId + '\'' +
                ", employId='" + employId + '\'' +
                '}';
    }
}
