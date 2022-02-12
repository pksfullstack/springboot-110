package com.pks;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
	// - local  - http://localhost:8080/springboot-110/message or http://localhost:8080/message
	// - docker - http://localhost:8085/message
	@GetMapping("/message")
	public String welcomeMessage() {
		try {
			return "Welcome to Sprint Boot V 10 : " + InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "error";
	}
}
