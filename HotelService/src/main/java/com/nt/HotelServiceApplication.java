package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}
	
	// Bean Configuration for RestTemplate
		@Bean 
		public RestTemplate restTemplate(){
		    return new RestTemplate();
		}

}
