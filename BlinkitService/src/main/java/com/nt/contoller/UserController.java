package com.nt.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/blinkit")
	public String getMethodName() {
		return "Welcome to Blinkit at Hyderabad.........!";
	}

}
