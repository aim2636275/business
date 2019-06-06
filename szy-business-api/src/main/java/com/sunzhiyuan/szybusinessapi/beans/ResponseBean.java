package com.sunzhiyuan.szybusinessapi.beans;

import com.sunzhiyuan.szybusinessapi.enums.ResponseCodeEnum;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;

/**
 * 统一JSON接口返回规范
 */
public class ResponseBean {
    public static final String RESPONSE_CODE_PREFIX = "ResponseCode.";
    protected Logger logger = LogManager.getLogger(getClass());
    private String errcode;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    private String msg;
    private Object data;
    private Object extra;
    private Locale locale;

    private MessageSource messageSource;

    public ResponseBean(MessageSource ms) {
        this.messageSource = ms;
        this.locale = Locale.CHINA;
    }
    public ResponseBean setCode(ResponseCodeEnum code) {
        return setCode(code,null);
    }
    public ResponseBean setCode(ResponseCodeEnum code,Object [] args) {
        this.errcode = code.getErrcode();
        this.msg = this.errcode;
        if(this.messageSource != null) {
            try {
                this.msg =
                    this.messageSource.getMessage(RESPONSE_CODE_PREFIX + this.errcode, args, locale);
            } catch (NoSuchMessageException e) {
                logger.warn(ExceptionUtils.getStackTrace(e));
                this.msg =
                    this.messageSource.getMessage(RESPONSE_CODE_PREFIX + this.errcode, args, Locale.CHINA);
            }
        }
        return this;
    }


    public String getMsg() {
        return msg;
    }

    public ResponseBean setMsg(String message) {
        this.msg = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseBean setData(Object data) {
        this.data = data;
        return this;
    }

    public Object getExtra() {
        return extra;
    }

    public ResponseBean setExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
