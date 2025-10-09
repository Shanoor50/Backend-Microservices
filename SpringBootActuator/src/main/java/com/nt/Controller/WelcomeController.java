package com.nt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/greet")
	public String getMarhodName() {
		return "Welcome to SpringBoot Actuator";
	}

	@GetMapping("/message")
	public String getMarhodNames() {
		return "Welcome to Hyderabad........!";
	}
}
