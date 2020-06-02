package com.dhiraj.Rating.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Product {
	
	@Id
	String productId;
	
	String productName;
	
	double price;
	
	String productDescription;
	
	int numberOfUsersRetedOne;
	
	int numberOfUsersRetedTwo;
	
	int numberOfUsersRetedThree;
	
	int numberOfUsersRetedFour;
	
	int numberOfUsersRetedFive;
	
	double rating;

	public Product(String productId, String productName, double price, String productDescription,
			int numberOfUsersRetedOne, int numberOfUsersRetedTwo, int numberOfUsersRetedThree,
			int numberOfUsersRetedFour, int numberOfUsersRetedFive) {
		this.productId = productId.toLowerCase();
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
		this.numberOfUsersRetedOne = numberOfUsersRetedOne;
		this.numberOfUsersRetedTwo = numberOfUsersRetedTwo;
		this.numberOfUsersRetedThree = numberOfUsersRetedThree;
		this.numberOfUsersRetedFour = numberOfUsersRetedFour;
		this.numberOfUsersRetedFive = numberOfUsersRetedFive;
		this.rating = setRating();
	}
	
	public double setRating() {
		int denominator = this.numberOfUsersRetedOne + this.numberOfUsersRetedTwo + this.numberOfUsersRetedThree + this.numberOfUsersRetedFour + this.numberOfUsersRetedFive;
		int numarator = (this.numberOfUsersRetedOne * 1) + (this.numberOfUsersRetedTwo * 2) + (this.numberOfUsersRetedThree * 3) + (this.numberOfUsersRetedFour * 4)+ (this.numberOfUsersRetedFive * 5) ;
		return Double.valueOf(String.format("%.2f", (double)numarator/(double)denominator));
	}

	public void setNumberOfUsersRetedOne() {
		this.numberOfUsersRetedOne++;
		this.rating = setRating();
	}
	

	public void setNumberOfUsersRetedTwo() {
		this.numberOfUsersRetedTwo++;
		this.rating = setRating();
	}

	public void setNumberOfUsersRetedThree() {
		this.numberOfUsersRetedThree++;
		this.rating = setRating();
	}

	public void setNumberOfUsersRetedFour() {
		this.numberOfUsersRetedFour++;
		this.rating = setRating();
	}

	public void setNumberOfUsersRetedFive() {
		this.numberOfUsersRetedFive++;
		this.rating = setRating();
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public int getNumberOfUsersRetedOne() {
		return numberOfUsersRetedOne;
	}

	public int getNumberOfUsersRetedTwo() {
		return numberOfUsersRetedTwo;
	}

	public int getNumberOfUsersRetedThree() {
		return numberOfUsersRetedThree;
	}

	public int getNumberOfUsersRetedFour() {
		return numberOfUsersRetedFour;
	}

	public int getNumberOfUsersRetedFive() {
		return numberOfUsersRetedFive;
	}

	public double getRating() {
		return rating;
	}

	
	
	
}
