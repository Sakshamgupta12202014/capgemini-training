package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsController {
	
	@RequestMapping("login.spring")
	public String loginValid() {
		return "Welcome to springboot application of java topics";
	}
	
	@RequestMapping("/javatopics")
	public List<JavaTopics> getAllTopics() {
		return Arrays.asList(new JavaTopics("SpringBoot", "SpringMVC", "Spring"), 
				new JavaTopics("JPA", "Hibernate", "JDBC"), 
				new JavaTopics("ReactJs", "Javascript", "UI-Development"));
	}
}
