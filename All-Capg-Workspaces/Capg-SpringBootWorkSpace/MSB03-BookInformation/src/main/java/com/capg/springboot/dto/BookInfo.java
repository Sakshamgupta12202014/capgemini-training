package com.capg.springboot.dto;

public class BookInfo {
	private int bookId;
	private String bookName;
	
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
	public BookInfo(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
}
