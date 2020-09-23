package com.obsm.bookstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obsm.bookstore.model.Admin;
import com.obsm.bookstore.model.BookInformation;
import com.obsm.bookstore.model.CartInformation;
import com.obsm.bookstore.model.CustomerInformation;
import com.obsm.bookstore.repository.AdminDao;
import com.obsm.bookstore.repository.BookDao;
import com.obsm.bookstore.repository.CartDao;
import com.obsm.bookstore.repository.CustomerDao;


@Service
@Transactional
public class ModelService {
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	BookDao bookDao;
	
	@Autowired
	CartDao cartDao;
	
	public CustomerInformation addNewCustomer(CustomerInformation customer) {
		// TODO Auto-generated method stub
		return customerDao.save(customer);
	}
	
	public Admin addNewAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}
	
	public BookInformation addNewBook(BookInformation book) {
		// TODO Auto-generated method stub
		return bookDao.save(book);
	}
	
	public CartInformation addNewCart(CartInformation cart) {
		// TODO Auto-generated method stub
		return cartDao.save(cart);
	}
	
	public List<Admin> allAdmin() {
		return adminDao.findAll();
	}
	
	public List<CustomerInformation> allCustomer() {
		return customerDao.findAll();
	}
	
	public List<BookInformation> allBook() {
		return bookDao.findAll();
	}
	
	public List<CartInformation> allCart() {
		return cartDao.findAll();
	}
}
