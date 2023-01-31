package com.clone.bewkoof.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.clone.bewkoof.model.Product;
import com.clone.bewkoof.repository.ProductRepo;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {
	
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/getAllProducts")
	public List<Product> getproduct(){
		return repo.findAll();
	}
	
	@GetMapping("/getProductByName/{name}")
	public List<Product> getproductByName(@PathVariable("name") String name){
		return repo.findByName(name);
	}
	
	@GetMapping("/getProductByPrice/{price}")
	public List<Product> getproductByPrice(@PathVariable("price") Integer price){
		return repo.findByPrice(price);
		}
	
	@PostMapping("/saveProduct")
	public Product saveproduct(@RequestBody Product product) {
		return repo.save(product);
	}

}
