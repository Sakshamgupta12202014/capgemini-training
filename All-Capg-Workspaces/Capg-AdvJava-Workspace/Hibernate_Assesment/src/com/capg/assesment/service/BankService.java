package com.capg.assesment.service;


import com.capg.assessment.bean.BankBean;
import com.capg.assessment.dao.BankDAO;

public class BankService {
	public boolean createAccount(String name,int accNum,long mobileNum,double balance) throws Exception {
		BankDAO bdao = new BankDAO();
		
		BankBean bb = new BankBean();
		bb.setAccountNumber(accNum);
		bb.setCustomerName(name);
		bb.setMobileNumber(mobileNum);
		bb.setBalance(balance);
		
		boolean status = bdao.addAccount(bb);

		return status;
		
	}
	
	public double showBalance(int accNum) throws Exception{
		BankDAO bdao = new BankDAO();
		double bal = bdao.getBalance(accNum);

		return bal;
	}
	
	public double deposit(int accNum,double amt)throws Exception  {
		BankDAO bdao = new BankDAO();
		double bal = bdao.depositBalance(accNum,amt);

		return bal;
	}
	
	public double withdraw(int acNum,double amt) throws Exception {
		BankDAO bdao = new BankDAO();
		double bal = bdao.withdrawBalance(acNum,amt);

		return bal;
	}
	
	public boolean fundTransfer(int fromAcc , int toAcc , double amt) throws Exception {
		BankDAO dao = new BankDAO();
		return dao.fundTransferToAcc(fromAcc , toAcc , amt);
	}
	
	public void printTransactions(int accNum) {
		BankDAO dao = new BankDAO();
		dao.printTransactionDetails(accNum); 
	}
}
