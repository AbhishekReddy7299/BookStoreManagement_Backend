package com.obsm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.bookstore.model.CartInformation;



public interface CartDao extends JpaRepository<CartInformation, Integer>{

}
