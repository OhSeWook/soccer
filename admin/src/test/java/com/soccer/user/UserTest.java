package com.soccer.user;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soccer.component.CustomPasswordEncoding;
import com.soccer.user.dto.UserRequestDto;
import com.soccer.user.entity.User;
import com.soccer.user.service.UserService;

//import lombok.extern.slf4j.Slf4j;

@SpringBootTest
class UserTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomPasswordEncoding customPasswordEncoding;

	@Test
	void userSaveFindTest() throws Exception {
		String password = customPasswordEncoding.sha256Encoding("1234");  
		UserRequestDto userRequestDto = new UserRequestDto("admin1", "슈퍼 관리자", password, "admin3@naver.com");
		User user = userService.userSave(userRequestDto);
		
		Optional<User> userFind = userService.userFindById(user.getId());
		
		assertEquals(user.getId(), userFind.get().getId()); 
	}

}
