package com.training.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.springmvc.model.Cart;
import com.training.springmvc.model.Product;
import com.training.springmvc.model.User;
import com.training.springmvc.service.CartService;
import com.training.springmvc.service.LoginService;
import com.training.springmvc.service.ProductService;

@Controller

public class HelloController {
	
	@Autowired
	LoginService service;
	
	
	@Autowired
	ProductService pservice;
	
	@Autowired
	CartService cservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView displayHello() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message", "LOGIN PAGE!");
		//map.addAttribute("message", "LOGIN PAGE!");
		return mav;
	}
	
	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
	public ModelAndView displayProduct(ModelMap map, HttpServletRequest request,@ModelAttribute("user") User user) {
		int userId=1;
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		if(service.validateUser(userName, password)) {
			map.addAttribute("name",userName);
			map.addAttribute("userId",userId);
			ModelAndView mav1 = new ModelAndView("product");
			List<Product> products= pservice.getProducts();
			mav1.addObject("allProducts", products);
			return mav1;
			
		}
		else {
			ModelAndView mav2 = new ModelAndView("product");
			return mav2;
			
		}
		//map.addAttribute("message", "LOGIN PAGE!");
	}
	
//	@RequestMapping(value = "/processLogin", method = RequestMethod.POST)
//	public String validateUser(ModelMap map, HttpServletRequest request) {
//		String userName = request.getParameter("uname");
//		String password = request.getParameter("pwd");
//		if(service.validateUser(userName, password)) {
//			map.addAttribute("name",userName);
//			ModelAndView mav1 = new ModelAndView("product");
//			List<Product> products= pservice.getProducts();
//			mav1.addObject("allProducts", products);
//			return "product";
//		}
//		else {
//			return "fail";
//		}
//		
//	}
//	
//	@RequestMapping(value="/return", method = RequestMethod.GET)
//	@ResponseBody
//	public String returnHelloMethod() {
//	    return "Hello world!";
//	}
//	
//	@RequestMapping(value="/addBook", method = RequestMethod.GET)
//	public String add() {
//		
//		
//			return "addBook";
//	
//	}
//	
	@RequestMapping(value="/addtocart/{id}/{name}/{desc}/{price}/{uid}", method = RequestMethod.GET)
	public String addToCart(ModelMap map, @PathVariable("id") Integer id,@PathVariable("name") String name,@PathVariable("desc") String desc,@PathVariable("price") Double price ,@PathVariable("uid") int uid, @ModelAttribute("cart") Cart cart, @ModelAttribute("user") User user) {
		
		
		cart.setProdId(id);
		cart.setProdName(name);
		cart.setProdDesc(desc);
		cart.setPrice(price);
		cart.setUser_id(uid);
		    if(cservice.addCart(cart)) {
		    	map.addAttribute("cartMsg", "Product Added Successfully");
		    	return "product";
		    }
		    else {
		    	map.addAttribute("cartMsg", "Error Addding Book**");
		    	return "product";
		    	
		    }
			
	
	}
	
	@RequestMapping(value = "/processCart", method = RequestMethod.GET)
	public ModelAndView displayCart(ModelMap map, HttpServletRequest request,@ModelAttribute("cart") Cart cart) {
		boolean carts= cservice.viewCart(cart);
		if(carts){
			ModelAndView mav3 = new ModelAndView("cart");
			List<Cart> cartsss= cservice.getCart(cart);
			mav3.addObject("cartsss", cartsss);
			return mav3;
			
		}
		else {
			ModelAndView mav4 = new ModelAndView("cart");
			return mav4;
			
		}
		//map.addAttribute("message", "LOGIN PAGE!");
	}

}
