package com.sunzhiyuan.szybusinessapi.enums;

/**
 * Created by sunzhiyuan on 2019/6/5.
 */
public enum ResponseCodeEnum {
    //通用信息
    SUCCESS("200"),
    ERROR("900000"),
    //参数相关,
    PARAM_ERROR("900001");

    private String errcode;

    private String code;
    ResponseCodeEnum(String code) {
        this.errcode = code;
    }

    public String getErrcode() {
        return this.errcode;
    }
}


