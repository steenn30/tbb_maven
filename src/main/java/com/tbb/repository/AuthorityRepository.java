package com.tbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tbb.entity.Authorities;
import com.tbb.entity.User;

@Repository
public interface AuthorityRepository extends JpaRepository<Authorities, Integer>{
	
	@Query("select a.authority from Authorities a where a.username= :username")
	List<String> getRoles(String username);
}

