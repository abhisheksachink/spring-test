package com.training.springmvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.springmvc.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
