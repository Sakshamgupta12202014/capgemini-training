package com.capg.assessment.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table (name = "bank_database")
public class BankBean implements Serializable{
	@Id
	private int accountNumber;
	private String customerName;
	private long mobileNumber;
	private double balance;
	
	@Column(length = 5000)  // Increase size to store multiple transactions
	private String transactionHistory;
	
	public BankBean(){}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getTransactionHistory() {
		return transactionHistory;
	}
	
	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
	public void addTransaction(String transaction) {
		if(this.transactionHistory == null || this.transactionHistory.isEmpty()) {
			this.transactionHistory = transaction;
		} else {
			this.transactionHistory += "###" + transaction;  // Using ### as delimiter
		}
	}
	
	
	
}
