package com.tbb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbb.dto.NewSeshDTO;
import com.tbb.entity.Ashtray;
import com.tbb.entity.Sesh;
import com.tbb.repository.SeshRepository;
@Service
public class SeshService {
	
	@Autowired
	SeshRepository seshRepository;
	
	public List<Sesh> getAllByPostId(Integer postId) {
		return seshRepository.findAllByPostId(postId);
	}
	
	public Sesh create(NewSeshDTO seshDTO) {
		// Need to create new chat thread id first
			// thread table that links sesh to thread
					// threadId
					// postId
					// seshId
					// 
			// thread comments table that links thread to comments
			
		Sesh newSesh = new Sesh();
		
		newSesh.setPostId(seshDTO.getPostId());
		newSesh.setChatThreadId(1);
		newSesh.setHostName(seshDTO.getHostName());
		newSesh.setSeatsAvailable(seshDTO.getSeatsAvailable());
		newSesh.setSeatsFilled(seshDTO.getSeatsFilled());
		newSesh.setSeshName(seshDTO.getSeshName());
		newSesh.setStartTime(seshDTO.getStartTime());
		
		
		return seshRepository.save(newSesh);
	}

}
