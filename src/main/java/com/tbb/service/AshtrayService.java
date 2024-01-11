package com.tbb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tbb.entity.Ashtray;
import com.tbb.repository.AshtrayRepository;
@Service
public class AshtrayService {

	@Autowired
	AshtrayRepository ashtrayRepository;
	
	public List<Ashtray> getAll() {
		return ashtrayRepository.findAll();
	}
	
	public List<Ashtray> getBySearchParam(String param) {
		return ashtrayRepository.findBySearchParam(param);
	}
	
	public List<Integer> getSubscribedAshtrayIds(Integer userId){
		List<Integer> ashtray_ids = ashtrayRepository.getSubscribedAshtrayIdsNativeQuery(userId);
		
		
		return ashtray_ids;
	}
	
	
	public Integer getAshtrayId(String ashtrayName) {
		
		
		List<Ashtray> ashtrays = ashtrayRepository.findAll();
		Integer ashtrayId = null;
		
		for(Ashtray a : ashtrays) {
			if(a.getAshtray_name().equalsIgnoreCase(ashtrayName)) {
				ashtrayId = a.getAshtray_id();
			}
		}
		
		return ashtrayId;
	}

}
