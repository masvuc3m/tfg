package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		DemoApplication app = new DemoApplication();
		String test = app.hello("World");
		assert test!=null : "metodo devuelve nulo";
	}

}
