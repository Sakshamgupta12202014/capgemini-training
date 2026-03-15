package com.capg.orderservice.model;


public class Book {
	
	
	private long id;
	
	
	private String title;
	
	private String author;
	
	private String isBn;
	
	private double price;
	
	private int quantity;
	private String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsBn() {
		return isBn;
	}
	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Book(long id, String title, String author, String isBn, double price, int quantity, String category) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isBn = isBn;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public Book() {}
}