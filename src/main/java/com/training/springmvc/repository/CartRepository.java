package com.training.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.springmvc.model.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
