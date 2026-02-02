package com.zeus;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class SpringBootFileUploadApplicationTests {

	@Test
	void contextLoads() {
		UUID uid = UUID.randomUUID(); //중복방지
		log.info("uid = " +uid.toString());
	}
	
}
