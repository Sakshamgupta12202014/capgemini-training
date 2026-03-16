package com.capg.orderservice.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="orders02")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(nullable=false)
	private Long bookId;
	
	@Column(nullable=false)
	private String customerName;
	
	@Column(nullable=false)
	private int quantity;
	
	@Column
	private Double totalPrice;
	
	@Column
	private String status;
	
	@Column
	private LocalDate orderDate;
	
	@PrePersist
	public void setDefaults() {
		
		// Automatically set initial order status
		this.status = "PLACED";
		
		// Automatically set order date
		this.orderDate = LocalDate.now();
	}

	public Order(Long id, Long bookId, String customerName, int quantity, double totalPrice, String status,
			LocalDate localDate) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.customerName = customerName;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.status = status;
		this.orderDate = localDate;
	}
	
	public Order() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate localDate) {
		this.orderDate = localDate;
	}
	
}
