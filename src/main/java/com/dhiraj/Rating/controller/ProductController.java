package com.dhiraj.Rating.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhiraj.Rating.model.Product;
import com.dhiraj.Rating.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	ProductRepository productRepository;
	
	
	
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}



	@PostMapping("")
	public Product insertProduct(@RequestBody Product product) {

			productRepository.save(product);
			
			return productRepository.findById(product.getProductId()).get();
			
			
		
	}
	
	
	
	

}
