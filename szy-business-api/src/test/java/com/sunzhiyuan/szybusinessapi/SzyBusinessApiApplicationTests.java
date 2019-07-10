package com.sunzhiyuan.szybusinessapi;

import com.sunzhiyuan.szybusinessapi.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SzyBusinessApiApplicationTests {

	@Autowired UserServiceImpl userService;


	@Test
	public void getUserInfo(){

		System.out.println(userService.queryUserById(1148457043674402816L));
	}

	@Test
	public void contextLoads() {
	}

}
