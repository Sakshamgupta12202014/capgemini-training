package com.capg.bookInfo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BookInfo")
public class BookInfo {
	
	@Id
	private int bookId;
	
	@Column(name="bookName", length = 20)
	private String bookName;
	
	@Column(name="bookAuthor", length = 20)
	private String bookAuthor;
	
	@Column(name="price", length = 10)
	private int price;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BookInfo(int bookId, String bookName, String bookAuthor, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
	public BookInfo() {
		
	}
	
}
