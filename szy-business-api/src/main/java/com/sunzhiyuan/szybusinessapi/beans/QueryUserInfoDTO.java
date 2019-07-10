package com.sunzhiyuan.szybusinessapi.beans;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by sunzhiyuan on 2019/7/10.
 * 查询用户信息请求参数bean
 */
@Data
public class QueryUserInfoDTO implements Serializable{
    private Long id;

    /**
     * 姓名
     */
    private String name;
    /**
     * 用户手机号
     */
    private String mobile;
    /**
     * 身份证号
     */
    private String idCardNo;
    /**
     * 银行卡号
     */
    private String bankCardNo;
    /**
     * 银行卡预留手机号
     */
    private String bankReservedMobile;
    /**
     * 银行卡类型
     */
    private Integer bankCardType;
}
