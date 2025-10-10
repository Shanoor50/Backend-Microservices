package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

	@GetMapping("/flightbooking")
	public String bookingFlight() {
		return "Booking flight at Hyderabad..........!";
	}
}
