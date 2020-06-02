package com.dhiraj.Rating.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String insertProduct(@RequestBody Product product) {

			productRepository.save(product);
			
			return product.getProductId() +" ADDED.";
		
	}
	
	@GetMapping("")
	public List<Product> getAllProducts(){
		
		return productRepository.findAll();
		
	}
	
	@GetMapping("/{productId}")
	public Product getOneProducts(@PathVariable String productId){
		
		return productRepository.findById(productId).get();
		
	}
	
	

}
