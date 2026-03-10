package com.capg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Employee_Client {
	public static void main(String []args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernate_annotation.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction txn = session.beginTransaction();
		
		try {
			Employee e = new Employee();
			e.setFirstName("Ramesh");
			e.setLastName("Kumar");
			e.setSalary(7000);
			
			session.save(e);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			System.out.println("Exception while creating employee " + e);
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
