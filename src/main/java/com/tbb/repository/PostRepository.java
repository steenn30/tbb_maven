package com.tbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tbb.entity.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

	
	@Query(value = "SELECT * FROM public.posts p WHERE p.ashtray_id IN (:ashtrayIds)", nativeQuery = true)
	List<Post> findAllPostsByAshtrayIdList(@Param("ashtrayIds")List<Integer> ashtrayIds);
}
