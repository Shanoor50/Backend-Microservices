package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HotelController {

	@Autowired
	private RestTemplate restTem;
	
	@GetMapping("/hotelbooking")
	public String hotelBooking() {
		
		String url="http://localhost:9091/flightbooking";
		String flightUrl=restTem.getForObject(url,String.class);
		
		return "Welcome to 5 Star Hotel at Hyderabad...!  =>"+flightUrl;
	}
}
