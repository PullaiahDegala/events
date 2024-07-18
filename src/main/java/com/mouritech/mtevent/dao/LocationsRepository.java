package com.mouritech.mtevent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.mtevent.model.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations,Integer>
{
	

}
