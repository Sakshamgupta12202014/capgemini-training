package com.capg.appointment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "DOCTOR-SERVICE")
public interface DoctorClient {
	
	@GetMapping("/doctor")
	public boolean checkDoctor();
}
