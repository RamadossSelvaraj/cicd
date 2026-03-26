package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.app.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
