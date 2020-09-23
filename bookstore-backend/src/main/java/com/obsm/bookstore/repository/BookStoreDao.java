package com.obsm.bookstore.repository;

import java.util.List;

import com.obsm.bookstore.model.BookInformation;
import com.obsm.bookstore.model.CartInformation;
import com.obsm.bookstore.model.CustomerInformation;
import com.obsm.bookstore.model.OrderInformation;




public interface BookStoreDao {
	
	public List<CartInformation> viewCartByCustomerId(int customerId);

	public boolean removeCartItem(CartInformation cart);

	public CartInformation viewCartByCartId(int cartId);

	public boolean updateCartQuantity(CartInformation cart);

	public List<OrderInformation> viewOrderByCustomerId(int customerId);

	public String addBookToCart(CartInformation cart);
	
	public List<BookInformation> viewBooks();
	
	public BookInformation getBook(int bookId);
	
	public void addCustomer(CustomerInformation customer);


}
