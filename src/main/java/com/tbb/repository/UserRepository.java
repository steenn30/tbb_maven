package com.tbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tbb.entity.User;


@Repository
public interface UserRepository extends
JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.username= :username")
	List<User> checkUsername(@Param("username") String username);
	
	@Query(value = "SELECT ui.user_id FROM public.user_info ui WHERE ui.username = cast (:username as text)", nativeQuery = true)
	List<Integer> getUserIdNativeQuery(@Param("username")String username);

}
