package com.dhiraj.Rating.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dhiraj.Rating.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
