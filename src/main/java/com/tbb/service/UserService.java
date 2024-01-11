package com.tbb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tbb.exceptions.UserNotFound;
import com.tbb.dto.RegisterUserDTO;
import com.tbb.dto.UserDTO;
import com.tbb.entity.Authorities;
import com.tbb.entity.User;
import com.tbb.repository.AuthorityRepository;
import com.tbb.repository.UserRepository;
import com.tbb.config.MyUserDetailsService;
import com.tbb.config.SecurityConfig;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	AuthorityRepository authRepository;
	
	@Autowired
	MyUserDetailsService userDetailsService;
	
	public User create(RegisterUserDTO user) {
		String encodedPassword = encoder.encode(user.getPassword());
		User userToAdd = new User(user.getUsername(), encodedPassword, true);
		Authorities a = new Authorities(userToAdd.getUsername(),"ADMIN");
		if(a.getUsername() != null) {
			userToAdd = userRepository.save(userToAdd);
			authRepository.save(a);
		}
		return userToAdd;	
	}
	
	public User checkCredentials(UserDTO user) {
		// we just want to check if this username and password exist in the db
		List<User> loggedInUserList = userRepository.checkUsername(user.getUsername());
		if(loggedInUserList.size() > 0) {
			User loggedInUser = loggedInUserList.get(0);
			if(encoder.matches(user.getPassword(), loggedInUser.getPassword())){
				userDetailsService.loadUserByUsername(loggedInUser.getUsername());
			}else {
				loggedInUser = null;
			}
			return loggedInUser;
		} else {
			throw new UserNotFound();
		}
	}
	
	public Integer getUserId(String username) {
		List<Integer> userId = userRepository.getUserIdNativeQuery(username);
		System.out.println("inside get UserId userservice. userId is" + userId);
		Integer id  =  userId.get(0);
		return id;
	}
	
	
}
