package com.capg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Assignment14EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment14EurekaServerApplication.class, args);
		System.out.println("Book Store Eureka Server started");
	}

}
