package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {
	
	public List topics = Arrays.asList(new CapgTopics("Spring boot", "Spring MVC", "Spring"), new CapgTopics("J2SE", "JDBC", "JAVA"));
	
	List<CapgTopics> myTopics = new ArrayList<CapgTopics>(topics);
	
	public List<CapgTopics> getAllMyTopics() {
		return myTopics;
	}
	
	
	// Search 
	public CapgTopics getTopics(String id) {
		return (CapgTopics) myTopics.stream().filter(t -> ((CapgTopics)t).getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(CapgTopics topic) {
		myTopics.add(topic);
	}
	
	public void deleteTopic(String id) {
		myTopics.removeIf(t-> ((CapgTopics)t).getId().equals(id));
	}
}	
