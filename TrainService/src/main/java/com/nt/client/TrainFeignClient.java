package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="HotelService")
public interface TrainFeignClient {
	
	@GetMapping("/hotel")
	public String hotelBookingDemo();

}
