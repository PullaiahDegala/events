package com.mouritech.mtevent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mouritech.mtevent.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
	
	

}
