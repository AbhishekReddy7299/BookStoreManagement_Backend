package com.obsm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.bookstore.model.Admin;



public interface AdminDao extends JpaRepository<Admin, Integer>{

}
