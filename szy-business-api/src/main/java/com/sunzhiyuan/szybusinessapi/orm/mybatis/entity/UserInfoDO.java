package com.sunzhiyuan.szybusinessapi.orm.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */
@Data
public class UserInfoDO implements Serializable {

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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
