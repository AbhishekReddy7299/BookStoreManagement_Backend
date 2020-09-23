package com.obsm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.bookstore.model.BookInformation;



public interface BookDao extends JpaRepository<BookInformation, Integer>{

}
