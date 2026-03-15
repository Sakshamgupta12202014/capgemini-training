package com.capg.bookservice.service;

import java.util.List;

import com.capg.bookservice.model.Book;

public interface BookServiceInt {
	List<Book> fetchAllBooks();
	Book getBookById(long id);
	Book addBook(Book book);
	Book updateBook(long id , Book book);
	void deleteBook(long id);
}
