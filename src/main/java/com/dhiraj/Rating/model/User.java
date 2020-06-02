package com.dhiraj.Rating.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "Users")
public class User {
	
	
	@Id
	String username;
	
	List<String> listOfProduct;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getListOfProduct() {
		return listOfProduct;
	}

	public void setListOfProduct(String productName) {
		this.listOfProduct.add(productName);
	}

	
	
	
	
	

}
