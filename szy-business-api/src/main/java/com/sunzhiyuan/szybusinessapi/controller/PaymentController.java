package com.sunzhiyuan.szybusinessapi.controller;

import com.sunzhiyuan.szybusinessapi.beans.ResponseBean;
import com.sunzhiyuan.szybusinessapi.enums.ResponseCodeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunzhiyuan on 2019/7/5.
 */
@RestController
@RequestMapping("/business/payment")
public class PaymentController extends BaseController {

    /**
     * 插入还款数据
     * @return
     */
    @RequestMapping("/insertPayment")
    public ResponseBean insertPayment() {
        return getResponseBean().setCode(ResponseCodeEnum.SUCCESS);
    }

    /**
     * 修改还款数据
     * @return
     */
    @RequestMapping("/updatePayment")
    public ResponseBean updatePayment() {
        return getResponseBean().setCode(ResponseCodeEnum.SUCCESS);
    }

    /**
     * 查询还款数据
     * @return
     */
    @RequestMapping("/queryPayment")
    public ResponseBean queryPayment() {
        return getResponseBean().setCode(ResponseCodeEnum.SUCCESS);
    }
}
