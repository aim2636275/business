package com.sunzhiyuan.szybusinessapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.sunzhiyuan"})
@EnableAutoConfiguration
@MapperScan({"com.sunzhiyuan.szybusinessapi.orm.mybatis.mappers"})
public class SzyBusinessApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzyBusinessApiApplication.class, args);
	}

}
