package com.tbb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tbb.entity.Ashtray;
import com.tbb.entity.Authorities;

@Repository
public interface AshtrayRepository extends JpaRepository<Ashtray, Integer> {

	
	@Query("select a from Ashtray a where a.ashtray_name like %:param%")
	List<Ashtray> findBySearchParam(String param);
	
	@Query(value = "SELECT * FROM public.subscribed_ashtrays sa WHERE sa.user_id = :userId", nativeQuery = true)
	List<Integer> getSubscribedAshtrayIdsNativeQuery(@Param("userId")Integer userId);
}
