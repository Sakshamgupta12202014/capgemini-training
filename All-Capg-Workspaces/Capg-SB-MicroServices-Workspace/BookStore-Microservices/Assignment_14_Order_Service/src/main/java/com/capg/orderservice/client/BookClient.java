package com.capg.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.orderservice.model.Book;

@FeignClient(name = "BOOK-SERVICE")
public interface BookClient {

    @GetMapping("/api/books")
    List<Book> fetchAllBooks();

    @GetMapping("/api/books/{id}")
    Book getBookById(@PathVariable("id") Long id);

    @PostMapping("/api/books")
    Book addBook(@RequestBody Book book);

    @PutMapping("/api/books/{id}")
    Book updateBook(@PathVariable("id") Long id,
                    @RequestBody Book book);

    @DeleteMapping("/api/books/{id}")
    void deleteBook(@PathVariable("id") Long id);
}
