package com.capg.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.exception.MyCustomException;

@RestController
public class Mycontroller {

	@GetMapping("/example/{bid}")
	public ResponseEntity<String> example(@PathVariable boolean bid){
		boolean someCondition = bid;
		System.out.println(someCondition);
		
		//simulate a custom exception
		
		if(someCondition) {
			throw new MyCustomException("This is  custom exception");
		}
		
		return ResponseEntity.ok("Request is Processing....");
	}
}
