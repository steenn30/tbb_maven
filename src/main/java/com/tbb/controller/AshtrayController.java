package com.tbb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tbb.entity.Ashtray;
import com.tbb.service.AshtrayService;
import com.tbb.service.UserService;

@RestController
public class AshtrayController {
	
	@Autowired
	AshtrayService ashtrayService;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/ashtray/newPost/search/{param}")
	public List<Ashtray> getAshtraysBySearchParam(@PathVariable String param) {
		
		List<Ashtray> allAshtrays =  ashtrayService.getAll();
		 List<Ashtray> filteredAshtrays = filteredAshtrays(allAshtrays, param);
		return filteredAshtrays;
	}
	
	
	@CrossOrigin(origins = "*")
	@GetMapping("/ashtray/getall")
	public List<Ashtray> getAshtrays() {
		
		return ashtrayService.getAll();
		
	}
	
	
	public List<Ashtray> filteredAshtrays(List<Ashtray> ashtrays, String param){
		
		 List<Ashtray> filteredAshtrays = new ArrayList<>();
		 
		 for(Ashtray a: ashtrays) {
			 String ashtrayName = a.getAshtray_name();
			 
			 if(ashtrayName.contains(param)) {
				filteredAshtrays.add(a); 
			 }
		 }
		
		return filteredAshtrays;
		
	}


}
