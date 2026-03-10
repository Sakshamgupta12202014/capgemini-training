package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgTopicsController {
	
	@Autowired
	CapgTopicsService topicService;
	
	@RequestMapping("/mycontoller")
	public String display() {
		return "My controller";
	}
	
	@RequestMapping("/capgtopics")
	public List<CapgTopics> getAllTopics() {
		return topicService.getAllMyTopics();
	}
	
	// Get all topics
	@RequestMapping("/capgtopics/{id}")
	public CapgTopics getTopics(@PathVariable String id) {
		return topicService.getTopics(id);
	}
	
	// add 
	@RequestMapping(method=RequestMethod.POST, value="/capgtopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/capgtopics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}		
