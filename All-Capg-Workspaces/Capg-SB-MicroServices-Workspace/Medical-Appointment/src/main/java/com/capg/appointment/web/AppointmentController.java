package com.capg.appointment.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.appointment.client.DoctorClient;
import com.capg.appointment.client.PatientClient;
import com.capg.appointment.dto.Patient;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	private DoctorClient doctorClient;
	private PatientClient patientClient;
	
	public AppointmentController(DoctorClient doctorClient, PatientClient patientClient) {
		super();
		this.doctorClient = doctorClient;
		this.patientClient = patientClient;
	}
	
	@GetMapping
	public ResponseJSON getAppointment() {
		
		Boolean isDoctorAvailable = doctorClient.checkDoctor();
		if(isDoctorAvailable) {
			Patient patient = patientClient.getAllPatient();
			return new ResponseJSON(101, "Neeraj Goyal", "Surgoen", patient);
		}
		return null;
	}
	
	private static class ResponseJSON {
		private int id;
		private String name;
		private String department;
		private Patient patient;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Patient getPatient() {
			return patient;
		}
		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public ResponseJSON(int id, String name, String department, Patient patient) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.patient = patient;
		}
		
		
	}
	
}
