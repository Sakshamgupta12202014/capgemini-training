package com.capg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
	
	public static void main(String []args) {
		
		// 1. Start hibernate framework	
		Configuration cfg = new Configuration();
		cfg.configure();   // loads the hibernate.cfg.xml
		
		// 2. Build Session Factory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3. Open session 
		Session session = factory.openSession();
		
		// 4. Begin Transaction 
		Transaction txn = session.beginTransaction();
		
		
		try {
			Student s1 = new Student();
			s1.setSno(1);
			s1.setSname("Saksham gupta");
			s1.setMobile(9389772204l);
			s1.setEmail("Saksham.gupta@lpu.in");
			
			session.save(s1);   // stores the student into the database 
			
			// 7. Commit Transaction
			txn.commit();
			System.out.println("Records Inserted successfully");
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}
}
