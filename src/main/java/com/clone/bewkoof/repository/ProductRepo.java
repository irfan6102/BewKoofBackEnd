package com.clone.bewkoof.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.bewkoof.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	List<Product> findByName(String name);
	List<Product> findByPrice(Integer price);

}
