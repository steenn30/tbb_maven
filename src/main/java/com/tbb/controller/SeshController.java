package com.tbb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbb.dto.NewSeshDTO;
import com.tbb.dto.RegisterUserDTO;
import com.tbb.entity.Ashtray;
import com.tbb.entity.Sesh;
import com.tbb.entity.User;
import com.tbb.service.SeshService;

@RestController
public class SeshController {

	@Autowired
	SeshService seshService;
	
	
	@CrossOrigin(origins = "*")
	@GetMapping(value="/sesh/getpostid/{postId}")
	public List<Sesh> getAshtraysBySearchParam(@PathVariable Integer postId) {
		
		List<Sesh> allSeshByPostId =  seshService.getAllByPostId(postId);
		
		return allSeshByPostId;
	}
	
	
	@CrossOrigin(origins = "*")
	@PostMapping(value="/sesh/newSesh")//consumes = "application/json"
	public Sesh createNewUser(@RequestBody NewSeshDTO sesh) {
		
		
		return seshService.create(sesh);
	
	}
}
