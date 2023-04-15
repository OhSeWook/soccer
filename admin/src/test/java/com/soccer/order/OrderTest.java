package com.soccer.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soccer.user.service.UserService;


@SpringBootTest
class  OrderTest{
	
	@Autowired
	private UserService userService;

	@Test
	void userSaveFindTest() throws Exception {
		
		
	}

}
