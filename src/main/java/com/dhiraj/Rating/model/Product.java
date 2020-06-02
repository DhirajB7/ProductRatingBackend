package com.dhiraj.Rating.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Products")
public class Product {
	
	@Id
	String productId;
	
	String productName;
	
	double price;
	
	String productDescription;
	
	double rating;
	
	int numberOfUsersRetedOne;
	
	int numberOfUsersRetedTwo;
	
	int numberOfUsersRetedThree;
	
	int numberOfUsersRetedFour;
	
	int numberOfUsersRetedFive;
	
	


	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNumberOfUsersRetedOne() {
		return numberOfUsersRetedOne;
	}

	public void setNumberOfUsersRetedOne(int numberOfUsersRetedOne) {
		this.numberOfUsersRetedOne = numberOfUsersRetedOne;
	}

	public int getNumberOfUsersRetedTwo() {
		return numberOfUsersRetedTwo;
	}

	public void setNumberOfUsersRetedTwo(int numberOfUsersRetedTwo) {
		this.numberOfUsersRetedTwo = numberOfUsersRetedTwo;
	}

	public int getNumberOfUsersRetedThree() {
		return numberOfUsersRetedThree;
	}

	public void setNumberOfUsersRetedThree(int numberOfUsersRetedThree) {
		this.numberOfUsersRetedThree = numberOfUsersRetedThree;
	}

	public int getNumberOfUsersRetedFour() {
		return numberOfUsersRetedFour;
	}

	public void setNumberOfUsersRetedFour(int numberOfUsersRetedFour) {
		this.numberOfUsersRetedFour = numberOfUsersRetedFour;
	}

	public int getNumberOfUsersRetedFive() {
		return numberOfUsersRetedFive;
	}

	public void setNumberOfUsersRetedFive(int numberOfUsersRetedFive) {
		this.numberOfUsersRetedFive = numberOfUsersRetedFive;
	}

}
