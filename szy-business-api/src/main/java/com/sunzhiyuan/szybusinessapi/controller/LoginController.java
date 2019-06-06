package com.sunzhiyuan.szybusinessapi.controller;

import com.sunzhiyuan.szybusinessapi.beans.ResponseBean;
import com.sunzhiyuan.szybusinessapi.enums.ResponseCodeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunzhiyuan on 2019/6/5.
 */
@RestController
@RequestMapping("/business/login")
public class LoginController extends BaseController {

    @RequestMapping("/login")
    public ResponseBean login() {
        return getResponseBean().setCode(ResponseCodeEnum.SUCCESS);
    }

}
