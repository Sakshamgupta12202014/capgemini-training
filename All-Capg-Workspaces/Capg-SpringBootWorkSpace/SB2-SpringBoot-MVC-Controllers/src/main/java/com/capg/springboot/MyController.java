package com.capg.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("login.spring")
	public String loginValid() {
		return "Welcome to SpringBoot Application";
	}
	
	@RequestMapping("saksham.spring")
	public String ramValid() {
		return "Welcome to Springboot Application Hello Saksham";
	}
}
