package com.training.springmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.springmvc.model.User;
import com.training.springmvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView("listUsers");
		List<User> users = service.getUsers();
		mav.addObject("allUsers", users);
		return mav;
		
	}
	
	@RequestMapping(value = "/newUsers", method = RequestMethod.GET)
	public String addUser(Map<String, Object> model) {
		User user = new User();
		model.put("user", user);
		return "addUser";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		System.out.println("UserID:::: "+user.getUser_id());
		service.saveUser(user);
		System.out.println("User data saved..");
		return "registrationDone";
	}

}
