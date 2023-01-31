package com.clone.bewkoof.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.bewkoof.model.User;
import com.clone.bewkoof.repository.UserRepo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
	 return	repo.findAll();
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user){
		return repo.save(user);
	}

}
