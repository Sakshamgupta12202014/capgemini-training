package com.capg.bookservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books02")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private String author;
	
	@Column(unique=true)
	private String isbn;
	
	@Column(nullable=false)
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isBn) {
		this.isbn = isBn;
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
	public Book(Long id, String title, String author, String isbn, double price, int quantity, String category) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public Book() {}
}
