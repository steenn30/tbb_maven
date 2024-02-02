package com.tbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tbb.entity.Ashtray;
import com.tbb.entity.Sesh;


@Repository
public interface SeshRepository extends JpaRepository<Sesh, Integer> {

	@Query(value = "SELECT * FROM public.sesh s WHERE s.post_id = :postId", nativeQuery = true)
	List<Sesh> findAllByPostId(@Param("postId")Integer postId);
	
	@Query(value = "SELECT s.sesh_name FROM public.sesh s WHERE s.chat_room_id = :chatroomId", nativeQuery = true)
	String findSeshBySeshId(@Param("chatroomId")Integer chatroomId);

}
