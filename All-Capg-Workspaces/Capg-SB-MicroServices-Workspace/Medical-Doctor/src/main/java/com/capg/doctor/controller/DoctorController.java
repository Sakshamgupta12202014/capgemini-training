package com.capg.doctor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@GetMapping
	public boolean isDoctorAvalable() {
//		just dummy response no logic
		return true;
	}
}
