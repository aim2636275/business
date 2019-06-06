package com.sunzhiyuan.szybusinessapi.config;

import com.sunzhiyuan.szybusinessapi.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by sunzhiyuan on 2019/6/5.
 */
@Configuration
@EnableAutoConfiguration
public class AppConfig {

    @Bean @Scope("prototype")
    public ResponseBean responseBean(MessageSource messageSource) {
        return new ResponseBean(messageSource);
    }


}
