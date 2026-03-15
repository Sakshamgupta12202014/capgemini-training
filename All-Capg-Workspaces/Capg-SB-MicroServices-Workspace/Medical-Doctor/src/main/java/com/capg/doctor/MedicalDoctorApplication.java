package com.capg.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedicalDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalDoctorApplication.class, args);
		System.out.println("The Doctor service is started");
	}

}
