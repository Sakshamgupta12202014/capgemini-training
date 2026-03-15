package com.capg.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Assignment14BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment14BookServiceApplication.class, args);
	}

}
