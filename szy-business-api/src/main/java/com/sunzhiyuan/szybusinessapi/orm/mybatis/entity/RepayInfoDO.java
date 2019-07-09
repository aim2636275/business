package com.sunzhiyuan.szybusinessapi.orm.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by sunzhiyuan on 2019/7/9.
 */
@Data
public class RepayInfoDO implements Serializable{
    private Long id;
    private Long businessId;
    private Integer status;
    private Integer payType;
    private BigDecimal payAmount;
    private BigDecimal realPayAmount;
    private Date paySuccessTime;
    private Long repaymentPlanId;
    private Long userInfoId;
    private String remark;
    private String reason;
    private Date createTime;
    private Date updateTime;
}
