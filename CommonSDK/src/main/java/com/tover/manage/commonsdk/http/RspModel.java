package com.tover.manage.commonsdk.http;

/**
 * Author by Mryang.
 * Date on 2018/9/12.
 * Description 网络接口返回数据规范
 */
public class RspModel<T> {
    private int backcode;
    private String message;
    private T data;

    public boolean success() {
        return backcode == 1;
    }

    public int getBackcode() {
        return backcode;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }


}

