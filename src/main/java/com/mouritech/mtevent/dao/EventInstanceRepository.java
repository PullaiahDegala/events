 package com.mouritech.mtevent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mouritech.mtevent.model.EventInstances;
import com.mouritech.mtevent.model.Locations;

@Repository
public interface EventInstanceRepository extends JpaRepository<EventInstances, Integer> {
	List<EventInstances> findByEvent(Integer eventId);

	@Query("select e from EventInstances e where e.event.eventId=:eventId ")
	List<EventInstances> getByEventId(@Param(value = "eventId") Integer eventId);

	
	

}
