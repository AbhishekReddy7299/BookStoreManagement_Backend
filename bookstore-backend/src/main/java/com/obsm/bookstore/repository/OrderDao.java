package com.obsm.bookstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obsm.bookstore.model.OrderInformation;



@Repository
public interface OrderDao extends JpaRepository<OrderInformation, Integer>{

}
