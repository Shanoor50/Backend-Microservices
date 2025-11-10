package com.nt.ms;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessageGenerator {
	
	@Value("${spring.application.instance-id}")
	private String instanceId;
	
	@GetMapping("/display")
	public ResponseEntity<String> showWishMessage(){
		//get system date and time
		LocalDateTime Idt = LocalDateTime.now();
		
		//get current hour of the day
		int hour = Idt.getHour();
		
		String msg="";
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good AfterNoon";
		else if(hour<20)
			msg="Good Evening";
		else
			msg="Good Night";
		
		return new ResponseEntity<String>(msg+"------>"+instanceId,HttpStatus.OK);
	}

}
