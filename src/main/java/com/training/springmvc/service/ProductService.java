package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.model.Product;
import com.training.springmvc.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getProducts(){
		
		List<Product> products = (List<Product>)productRepository.findAll();
		return products;
	}	
	
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

}
