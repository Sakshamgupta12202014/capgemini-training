package com.capg.bookInfo.service;

import java.util.List;

import com.capg.bookInfo.entity.BookInfo;

public interface BookInfoServiceInt {
	public List<BookInfo> getAllBooks();
	public Boolean addBook(BookInfo book);
}
