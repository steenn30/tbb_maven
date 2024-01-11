package com.tbb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbb.dto.RegisterUserDTO;
import com.tbb.entity.User;

@RestController
public class StripePaymentController {

	
//	@CrossOrigin(origins = "*")
//	@PostMapping(value="/create-customer-portal-session")//consumes = "application/json"
//	public User createNewUser(@RequestBody RegisterUserDTO user) {
//		
//		// Authenticate your user.
//		  SessionCreateParams params = SessionCreateParams.builder()
//		    .setCustomer("{{ CUSTOMER_ID }}")
//		    .setReturnUrl("https://example.com/account")
//		    .build();
//
//		  Session session = Session.create(params);
//
//		  response.redirect(session.getUrl());
//	
//	}
}
