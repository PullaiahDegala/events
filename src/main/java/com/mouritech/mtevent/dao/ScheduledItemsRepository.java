package com.mouritech.mtevent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mouritech.mtevent.model.ScheduledItems;

@Repository
public interface ScheduledItemsRepository extends JpaRepository<ScheduledItems, Integer> {

	@Query("select i from ScheduledItems i where i.eventInstanceId.eventInstanceId= :eventInstanceId")
	List<ScheduledItems> findByEventInstanceId(Integer eventInstanceId);

}
