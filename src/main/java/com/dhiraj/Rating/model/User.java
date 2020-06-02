package com.dhiraj.Rating.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Users")
public class User {
	
	@Id
	String username;
	
	List<Product> listOfProduct;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Product> getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(List<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	

}
