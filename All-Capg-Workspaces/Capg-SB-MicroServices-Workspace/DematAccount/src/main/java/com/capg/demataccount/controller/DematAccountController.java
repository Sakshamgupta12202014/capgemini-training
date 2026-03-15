package com.capg.demataccount.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demat")
public class DematAccountController {
	
	@GetMapping
	public String getDematAccountDetails() {
		return "Demat Account details:- DematAccountId = 1001, Amount = 35400, Interest = 2%";
	}
}
