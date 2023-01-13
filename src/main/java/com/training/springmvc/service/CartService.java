package com.training.springmvc.service;

import java.util.List;

import com.training.springmvc.model.Cart;

public interface CartService {
	
	boolean addCart(Cart cart);

	boolean viewCart(Cart cart);
	
	List<Cart> getCart(Cart cart);

}
