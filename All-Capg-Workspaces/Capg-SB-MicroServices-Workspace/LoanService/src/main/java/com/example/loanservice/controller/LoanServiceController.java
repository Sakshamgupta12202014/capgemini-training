package com.example.loanservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanServiceController {
	
	@GetMapping
	public String getLoanDetails() {
		return "Loan details:- LoanId = 1001, LoanAmount = 35400, LoanInterest = 2%";
	}
}
