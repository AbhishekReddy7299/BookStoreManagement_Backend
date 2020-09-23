package com.obsm.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.bookstore.model.Admin;
import com.obsm.bookstore.model.BookInformation;
import com.obsm.bookstore.model.CartInformation;
import com.obsm.bookstore.model.CustomerInformation;
import com.obsm.bookstore.service.ModelService;



@RestController
public class ModelController {
	
	@Autowired
	ModelService service;
	
	@PostMapping("/addNewCustomer")
	public CustomerInformation addNewCustomer(@RequestBody CustomerInformation customer) {
		return service.addNewCustomer(customer);
	}
	
	@PostMapping("/addNewAdmin")
	public Admin addNewAdmin(@RequestBody Admin admin) {
		return service.addNewAdmin(admin);
	}
	
	@PostMapping("/addNewBook")
	public BookInformation addNewBook(@RequestBody BookInformation book) {
		return service.addNewBook(book);
	}
	
	@PostMapping("/addNewCart")
	public CartInformation addNewCart(@RequestBody CartInformation cart) {
		return service.addNewCart(cart);
	}
	
	@GetMapping("/allCustomer")
	public List<CustomerInformation> getAllCustomers() {
		return service.allCustomer();
	}
	
	@GetMapping("/allAdmin")
	public List<Admin> getAllAdmins() {
		return service.allAdmin();
	}
	
	@GetMapping("/allBook")
	public List<BookInformation> getAllBooks() {
		return service.allBook();
	}
	
	@GetMapping("/allCart")
	public List<CartInformation> getAllCarts() {
		return service.allCart();
	}
}
