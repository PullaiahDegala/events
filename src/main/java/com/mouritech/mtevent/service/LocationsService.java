package com.mouritech.mtevent.service;

import com.mouritech.mtevent.dto.LocationsDto;

public interface LocationsService 
{
	public LocationsDto setLocations(LocationsDto locationsDto);
	public LocationsDto updateetLocations(LocationsDto locationsDto);
	public Boolean deleteLocations(Integer id);
	

}
