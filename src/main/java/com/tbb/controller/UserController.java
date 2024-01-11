package com.tbb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tbb.dto.RegisterUserDTO;
import com.tbb.dto.UserDTO;
import com.tbb.entity.User;
import com.tbb.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="/login")//consumes = "application/json"
	public User getExistingUser(@RequestBody UserDTO user) {
	
		System.out.println(user);
		return userService.checkCredentials(user);
	
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="/register/newUser")//consumes = "application/json"
	public User createNewUser(@RequestBody RegisterUserDTO user) {
		
		System.out.println(user);
		System.out.println("e");
		return userService.create(user);
	
	}
	
}
