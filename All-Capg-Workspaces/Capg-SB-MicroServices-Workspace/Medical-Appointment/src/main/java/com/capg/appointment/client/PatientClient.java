package com.capg.appointment.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.capg.appointment.dto.Patient;

@FeignClient(name = "PATIENT-SERVICE")
public interface PatientClient {
	
	@GetMapping("/patient")
	public Patient getAllPatient();
}
