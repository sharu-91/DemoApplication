package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		String response = DemoApplication.hello("sharan");
		System.out.println("Response of the name " + response);
		System.out.println("Response of the name " + response.equals("Hello Sharan!"));
	}

}
