package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmployeeService e1 = (EmployeeService) factory.getBean("e1");
		e1.displayDetails();
		EmployeeService e2 = (EmployeeService) factory.getBean("e2");
		System.out.println();
		e2.displayDetails();
		
		factory.close();
		
	}

}
