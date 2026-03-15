package com.capg.patient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.patient.dto.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@GetMapping
	public Patient getAllPatient() {
		return new Patient(101, "abc" , "chandausi");
	}
}
