package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.model.Cart;
import com.training.springmvc.repository.CartRepository;


@Service
public class CartServiceImpl implements CartService{
	
	
	@Autowired
	CartRepository cartRepository;
	



	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart c1=cartRepository.save(cart);
		if(c1 != null)
			return true;
		else {
			return false;
		}
	}
	
//	@Override
//	public boolean viewCart(Cart cart) {
//		// TODO Auto-generated method stub
//		List<Cart> carts=(List<Cart>)cartRepository.findAll();
//		if(carts != null)
//			return true;
//		else {
//			return false;
//		}
//	}
	


	@Override
	public boolean viewCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cart> getCart(Cart cart) {
		List<Cart> carts= (List<Cart>)cartRepository.findAll();
		// TODO Auto-generated method stub
		return carts;
	}


    

}
