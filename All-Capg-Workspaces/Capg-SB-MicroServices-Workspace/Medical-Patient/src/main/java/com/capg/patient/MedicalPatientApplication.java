package com.capg.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedicalPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalPatientApplication.class, args);
		System.out.println("PATIENT SERVICE STARTED ");
	}

}
