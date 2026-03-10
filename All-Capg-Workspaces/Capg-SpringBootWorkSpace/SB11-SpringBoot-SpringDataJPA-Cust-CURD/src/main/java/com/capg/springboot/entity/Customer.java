package com.capg.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_info1")
public class Customer {
	
	@Id
	@Column(name = "custId", length=10)
	private int custId;
	
	@Column(name = "cname", length=10)
	private String cname;
	
	@Column(name = "address", length=10)
	private String address;

	public Customer() {
		
	}
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
