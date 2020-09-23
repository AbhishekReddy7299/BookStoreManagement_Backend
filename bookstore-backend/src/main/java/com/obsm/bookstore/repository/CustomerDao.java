package com.obsm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.bookstore.model.CustomerInformation;



public interface CustomerDao extends JpaRepository<CustomerInformation, Integer>{

}
