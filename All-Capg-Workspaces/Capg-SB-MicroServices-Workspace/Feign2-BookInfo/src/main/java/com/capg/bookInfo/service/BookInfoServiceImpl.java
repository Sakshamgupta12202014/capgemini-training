package com.capg.bookInfo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.bookInfo.entity.BookInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
@Transactional
public class BookInfoServiceImpl implements BookInfoServiceInt {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<BookInfo> getAllBooks() {
		Query query = em.createQuery("Select b from BookInfo b");
		List<BookInfo> bookList = query.getResultList();
		return bookList;
	}


	@Override
	public Boolean addBook(BookInfo book) {
		BookInfo bookAdded = em.merge(book);
		if(bookAdded != null) return true;
		return false;
	}

}
