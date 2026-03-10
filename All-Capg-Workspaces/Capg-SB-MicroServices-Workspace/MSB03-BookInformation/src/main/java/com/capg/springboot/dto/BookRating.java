package com.capg.springboot.dto;

public class BookRating {
	private int bookId;
	private int rating;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public BookRating(int bookId, int rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}
	
}
