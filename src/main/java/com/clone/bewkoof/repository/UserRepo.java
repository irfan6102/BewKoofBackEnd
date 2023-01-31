package com.clone.bewkoof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.bewkoof.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
