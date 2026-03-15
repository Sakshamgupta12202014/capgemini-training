package com.capg.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MedicalAppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalAppointmentApplication.class, args);
		System.out.println("APPOINTMENT SERVER IS STARTED....");
	}

}
