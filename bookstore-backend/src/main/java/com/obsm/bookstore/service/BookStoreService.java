package com.obsm.bookstore.service;

import java.util.List;

import com.obsm.bookstore.exception.BookNotFoundException;
import com.obsm.bookstore.exception.InvalidQuantityException;
import com.obsm.bookstore.exception.RecordAlreadyPresentException;
import com.obsm.bookstore.exception.RecordNotFoundException;
import com.obsm.bookstore.model.BookInformation;
import com.obsm.bookstore.model.CartInformation;
import com.obsm.bookstore.model.OrderInformation;


public interface BookStoreService {

	public List<CartInformation> viewCartByCustomerId(int customerId);

	public String addBookToCart(int bookId, int customerId, String status)  throws BookNotFoundException;

	public boolean removeCartItem(int cartId);

	public boolean clearCartByCustomerId(int customerId);

	public String updateCart(int cartId,int quantity) throws InvalidQuantityException ;
	
	public OrderInformation addOrder(OrderInformation order) throws RecordAlreadyPresentException;
	
	public OrderInformation viewOrderById(int id);
	
	public Iterable<OrderInformation> listAllOrder();
	
	public List<OrderInformation> viewOrderByCustomerId(int customerId);
	
	public List<BookInformation> viewBooks() throws RecordNotFoundException;


}
