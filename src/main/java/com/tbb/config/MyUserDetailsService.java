package com.tbb.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.tbb.entity.Authorities;
import com.tbb.entity.User;
import com.tbb.repository.AuthorityRepository;
import com.tbb.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {
    private static List<User> users = new ArrayList<User>();
  

    @Autowired
	AuthorityRepository authRepository;
    
    @Autowired
    UserRepository userRepository;
    
    //private static List<User> users = userRepository.findAll();
    
    
    public MyUserDetailsService(){
    	super();

    }
	
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	
    	List<User> loggedInUserList = userRepository.checkUsername(username);
    	User user = loggedInUserList.get(0);
//        Optional<User> user = users.stream()
//                                         .filter(u -> u.getUsername().equals(username))
//                                         .findAny();
//        if (!user.isPresent()) {
//            throw new UsernameNotFoundException("User not found by name: " + username);
//        }
        return toUserDetails(user);
    }
    private UserDetails toUserDetails(User user) {
    	
    	List<String> a = authRepository.getRoles(user.getUsername());
    	String roles = "";
    	for(String authority : a) {
    		roles=roles + authority +",";
    	}
    	String trimmedRoles = "";
    	if(roles.charAt(roles.length()-1) == ',') {
    		trimmedRoles = roles.substring(0, roles.length()-2);
    	}
    	
    	//System.out.println("toUserDetailsBean printing roles that need to be commas seperated" + a.toString());
    	 
    	return org.springframework.security.core.userdetails.User.withUsername(user.getUsername()).password(user.getPassword()).roles(trimmedRoles).build();
    }    
}