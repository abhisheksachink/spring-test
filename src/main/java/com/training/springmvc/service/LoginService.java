package com.training.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springmvc.model.User;
import com.training.springmvc.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository repository;
	
	public boolean validateUser(String userName, String password) {
		
		List<User> users = (List<User>)repository.findAll();
		boolean isValid = false;
		for(User usr: users) {
			if(usr.getUser_name().equals(userName) && usr.getUser_pwd().equals(password)) {
				
				isValid = true;
			}
			
		}
		return isValid;
		
		/*
		 * if(userName.equals("john") && password.equals("1234")) { return true; } else
		 * { return false; }
		 */
	}
}
