package com.pks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	// - local  - http://localhost:8080/springboot-110/message
	// - docker - http://localhost:8085/message
	@GetMapping("/message")
	public String welcomeMessage() {
		return "Welcome to Sprint Boot V 8.";
	}
}
