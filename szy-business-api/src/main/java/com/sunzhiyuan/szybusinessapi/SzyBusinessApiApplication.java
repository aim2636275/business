package com.sunzhiyuan.szybusinessapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.sunzhiyuan"})
@EnableAutoConfiguration
public class SzyBusinessApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzyBusinessApiApplication.class, args);
	}

}
