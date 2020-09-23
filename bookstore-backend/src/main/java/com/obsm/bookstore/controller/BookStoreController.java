package com.obsm.bookstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.bookstore.exception.BookNotFoundException;
import com.obsm.bookstore.exception.RecordNotFoundException;
import com.obsm.bookstore.model.BookInformation;
import com.obsm.bookstore.model.CartInformation;
import com.obsm.bookstore.service.BookStoreService;


@RestController
public class BookStoreController {
	
	@Autowired
	public BookStoreService service;
	
	
	@GetMapping("/viewcartbycustomerid/{customerid}")
	public List<CartInformation> viewCartByCustomerId(@PathVariable("customerid") int customerId) {
			return service.viewCartByCustomerId(customerId);
	}
	
	@PostMapping("/addbooktocart/{bookid}/{customerid}/{status}")
	public String addBookToCart(@PathVariable("bookid") int bookId, @PathVariable("customerid")int customerId,
			@PathVariable("status")String status) throws BookNotFoundException {
		return service.addBookToCart(bookId, customerId, status);
	}
	
	@GetMapping("/viewallbooks")
	public List<BookInformation> viewdDiagnosisCentre() throws RecordNotFoundException {
		return service.viewBooks();
	}
	
	@DeleteMapping("/removecartitem/{cartid}")
	public boolean removeCartItem(@PathVariable("cartid") int cartId, HttpServletRequest request) {
		return service.removeCartItem(cartId);
	}
	
	@DeleteMapping("/clearcartbycustomerid/{customerid}")
	public boolean clearCartByCustomerId(@PathVariable("customerid") int customerId, HttpServletRequest request) {
		return service.clearCartByCustomerId(customerId);
	}
	
}
