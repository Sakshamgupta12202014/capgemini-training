package com.capg.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedicalGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalGatewayServiceApplication.class, args);
		System.out.println("MEDICAL GATEWAY SERVICE STARTED.......");
	}

}
