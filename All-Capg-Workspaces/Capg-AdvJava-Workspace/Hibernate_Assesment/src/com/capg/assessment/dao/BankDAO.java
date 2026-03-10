package com.capg.assessment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.capg.assessment.bean.BankBean;
import com.capg.assessment.util.HibernateUtil;

public class BankDAO {
	public boolean addAccount(BankBean bb) throws Exception {
		Session session = null;
		Transaction tx = null;
		boolean status = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			
			bb.addTransaction("Account created with balance: " + bb.getBalance() + 
                    " | Date: " + new java.util.Date());
			
			session.save(bb);
			status = true;
			tx.commit();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		return status;
	}
	
	public double getBalance(int accNum) {
		Session session = null;
		Transaction tx = null;
		double bal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			
			BankBean bb = (BankBean) session.get(BankBean.class, accNum);
			bal = bb.getBalance();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return bal;
	}
	
	public double depositBalance(int acNum,double amt) {
		Session session = null;
		Transaction tx = null;
		double upBal = 0;
		double oldBal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			
			BankBean bb = (BankBean) session.get(BankBean.class, acNum);
			
			oldBal = bb.getBalance();
			upBal =  oldBal + amt;
			bb.setBalance(upBal);
			
			bb.addTransaction("Deposit: +" + amt + " | Previous: " + oldBal + 
                    " | New: " + upBal + " | Date: " + new java.util.Date());
			
			session.update(bb);
			tx.commit();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return upBal;
		
	}
	
	public double withdrawBalance(int acNum,double amt) {
		Session session = null;
		Transaction tx = null;
		double upBal = 0;
		double oldBal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
			
			BankBean bb = (BankBean) session.get(BankBean.class, acNum);
			
			oldBal = bb.getBalance();
			upBal = oldBal - amt;
			bb.setBalance(upBal);
			
			bb.addTransaction("Withdrawal: -" + amt + " | Previous: " + oldBal + 
                    " | New: " + upBal + " | Date: " + new java.util.Date());
			
			session.update(bb);
			tx.commit();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
		
		return upBal;
	}
	
	public boolean fundTransferToAcc(int accFrom , int accTo , double amt) {
		Session session = null;
		Transaction txn = null;
		double oldBalFrom = 0;
		double updBalFrom = 0;
		
		double oldBalTo= 0;
		double updBalTo = 0;
		boolean status = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankBean bbFrom = (BankBean) session.get(BankBean.class , accFrom);
			oldBalFrom = bbFrom.getBalance();
			updBalFrom = oldBalFrom - amt;
			bbFrom.setBalance(updBalFrom);
			
			bbFrom.addTransaction("Fund Transfer to A/C " + accTo + ": -" + amt + 
                    " | Previous: " + oldBalFrom + " | New: " + updBalFrom + 
                    " | Date: " + new java.util.Date());
			
			
			BankBean bbTo = (BankBean) session.get(BankBean.class , accTo);
			oldBalTo = bbTo.getBalance();
			updBalTo = oldBalTo + amt;
			bbTo.setBalance(updBalTo);
			
			bbTo.addTransaction("Fund Transfer from A/C " + accFrom + ": +" + amt + 
                    " | Previous: " + oldBalTo + " | New: " + updBalTo + 
                    " | Date: " + new java.util.Date());
			
			
			txn.commit();
			
			status = true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return status;
	}
	
	public void printTransactionDetails(int accNum){
		Session session = null;
		Transaction txn = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankBean bb = (BankBean) session.get(BankBean.class, accNum);
			
			if(bb != null) {
				System.out.println("\n========================================");
				System.out.println("Transaction History for A/C: " + accNum);
				System.out.println("Customer: " + bb.getCustomerName());
				System.out.println("========================================");
				
				String history = bb.getTransactionHistory();
				
				if(history != null && !history.isEmpty()) {
					// Split transactions by delimiter
					String[] transactions = history.split("###");
					
					for(int i = 0; i < transactions.length; i++) {
						System.out.println((i+1) + ". " + transactions[i]);
					}
				} else {
					System.out.println("No transactions found.");
				}
				System.out.println("========================================\n");
			} else {
				System.out.println("Account not found!");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	
}
	
	

