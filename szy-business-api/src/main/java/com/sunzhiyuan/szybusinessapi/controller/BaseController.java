package com.sunzhiyuan.szybusinessapi.controller;

import com.sunzhiyuan.szybusinessapi.beans.ResponseBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
/**
 * Created by sunzhiyuan on 2019/6/5.
 */
public class BaseController {
    protected Logger logger = LogManager.getLogger(this.getClass());
    @Autowired protected MessageSource messageSource;
    @Autowired protected ApplicationContext context;
    @Autowired protected LocaleResolver localeResolver;

    /**
     * 获取返回生成返回结果的ResponseBean
     */
    protected ResponseBean getResponseBean() {
        ResponseBean bean = (ResponseBean) context.getBean("responseBean");
        if (bean != null) {
            bean.setLocale(getCurrentLocale());
            return bean;
        } else {
            logger.error("no bean defined with Type ResponseBean");
            return null;
        }
    }

    protected Locale getCurrentLocale() {
        try {
            ServletRequestAttributes sra =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest req = sra.getRequest();
            return localeResolver.resolveLocale(req);
        } catch (Exception e) {
            logger.error("get locale error", e);
            return Locale.CHINA;
        }
    }
}
