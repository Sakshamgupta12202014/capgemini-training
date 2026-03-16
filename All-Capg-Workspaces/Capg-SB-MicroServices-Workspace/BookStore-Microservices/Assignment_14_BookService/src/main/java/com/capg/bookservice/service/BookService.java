package com.capg.bookservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.bookservice.model.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class BookService implements BookServiceInt{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Book> fetchAllBooks() {
		Query query = em.createQuery("Select b from Book b");
		List<Book> books = query.getResultList();
		return books;
	}

	@Override
	public Book getBookById(long id) {
		Book book = em.find(Book.class, id);
		return book;
	}

	@Override
	public Book addBook(Book book) {
		em.persist(book);
		return book;
	}

	@Override
	public Book updateBook(long id, Book book) {
		Book bookToUpdate = em.find(Book.class, id);
		bookToUpdate.setAuthor(book.getAuthor());
		bookToUpdate.setCategory(book.getCategory());
		bookToUpdate.setPrice(book.getPrice());
		bookToUpdate.setQuantity(book.getQuantity());
		
		em.merge(bookToUpdate);
		return bookToUpdate;
	}

	@Override
	public void deleteBook(long id) {
		Book book = em.find(Book.class, id);
		em.remove(book);
	}

}
