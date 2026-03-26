package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Book;
import com.app.repository.BookRepo;

@RestController
@RequestMapping("/api/book")
@CrossOrigin("http://localhost:5173/")
public class BookController {

	@Autowired
	private BookRepo bRepo;
	
	@GetMapping
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book){
		return bRepo.save(book);
	}
}
