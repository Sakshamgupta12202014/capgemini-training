package com.capg.bookdepo.entity;



public class BookInfo {
	
	private int bookId;
	
	private String bookName;
	
	private String bookAuthor;
	
	private int price;
	
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
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