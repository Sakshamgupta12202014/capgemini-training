package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Msb03BookInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msb03BookInformationApplication.class, args);
		System.out.println("MSB03 is running");
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
