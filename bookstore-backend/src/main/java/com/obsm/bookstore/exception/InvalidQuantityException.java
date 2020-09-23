package com.obsm.bookstore.exception;

public class InvalidQuantityException extends Exception{

	@Override
	public String getMessage() {
		
		return "Invalid quantity added";
	}

	
	
}
