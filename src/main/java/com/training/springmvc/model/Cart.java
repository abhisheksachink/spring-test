package com.training.springmvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("com.training.springmvc")
//@ComponentScan(basePackages = { "com.training.springmvc" })
@Entity
@Table(name = "cart")
public class Cart {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cart_id;
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="product_Id")
	private int prodId;

	@Column(name="product_Name")
	private String prodName;
	
	@Column(name="product_desc")
	private String prodDesc;
	
	@Column(name="price")
	private double price;

	public Cart(int user_id, int prodId, String prodName, String prodDesc, double price) {
		super();
		this.user_id = user_id;
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.price = price;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	
	

	

	
}
