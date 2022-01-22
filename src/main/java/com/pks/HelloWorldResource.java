package com.pks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	//http://localhost:8080/springboot-110/message
	@GetMapping("/message")
	public String welcomeMessage() {
		return "Welcome to Sprint Boot V 2.";
	}
}
