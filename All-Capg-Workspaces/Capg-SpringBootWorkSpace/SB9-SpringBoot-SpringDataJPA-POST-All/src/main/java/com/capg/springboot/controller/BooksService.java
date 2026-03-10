package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	
	@Autowired 
	BooksRepository booksRepository;
	
	
	public void addBook(Books book) {
		booksRepository.save(book);
	}
	
	// get all books from database through SpringDataJPA
	
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		
		booksRepository.findAll().forEach(b1 -> books.add(b1));
		System.out.println(books);
		return books;
	}
}
