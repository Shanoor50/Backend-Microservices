package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.TrainFeignClient;

@RestController
public class TrainController {

	@Autowired 
	private TrainFeignClient trainFC;
	@GetMapping("/trainbooking")
	public String trainBooking() {
		
		String hotelBooking = trainFC.hotelBookingDemo();
		
		return "Welcome to Hyderabad Railway Station.....! ==>"+hotelBooking;
	}
}
