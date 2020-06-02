package com.dhiraj.Rating.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.Rating.model.Product;
import com.dhiraj.Rating.model.User;
import com.dhiraj.Rating.repository.ProductRepository;
import com.dhiraj.Rating.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")

public class UserController {
	
	UserRepository userRepository;
	ProductRepository productRepository;
	


	public UserController(UserRepository userRepository, ProductRepository productRepository) {
		this.userRepository = userRepository;
		this.productRepository = productRepository;
	}

	
	@PostMapping("")
    public String addUser(@RequestBody User user) {
    	
		userRepository.save(user);
		
		return user.getUsername()+" added";
    	
    }
	
	@GetMapping("")
	public List<User> getAllUser(){
		
		return userRepository.findAll();
		
	}
	
	@GetMapping("/{username}")
	public User getOneUser(@PathVariable String username){
		
		return userRepository.findById(username).get();
		
	}
	
	@PutMapping("/{username}/{productName}")
	public String addProductToUser(@PathVariable String username,@PathVariable String productName) {
		
		
		User user = userRepository.findById(username).get();
		user.setListOfProduct(productName);
		userRepository.save(user);
		
		
		return "PRODUCT "+productName+" added to User "+username;
		
		
	}
	
	@PutMapping("/{username}/{productName}/{rating}")
	public String addRatingToAProduct(@PathVariable String username,@PathVariable String productName,@PathVariable int rating) {
		
		
		Product product = productRepository.findById(productName).get();
		
		if(rating==1) {
			
			product.setNumberOfUsersRetedOne();
			
			System.out.println("1");
			
		}else if(rating==2) {
			
			product.setNumberOfUsersRetedTwo();
			
			System.out.println("2");
			
		}else if(rating==3) {
			
			product.setNumberOfUsersRetedThree();
			
			System.out.println("3");
			
		}else if(rating==4) {
			
			product.setNumberOfUsersRetedFour();
			
			System.out.println("4");
			
		}else if(rating==5) {
			
			product.setNumberOfUsersRetedFive();
			
			System.out.println("5");
			
		}else {
			
			System.out.println("WRONG RATING ENTRED");   
			
		}
		
		productRepository.save(product);
		
		return "CHECK DB";
		
		
		
		
	}
	
	
}
