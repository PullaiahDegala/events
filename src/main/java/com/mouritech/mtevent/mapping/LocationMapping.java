package com.mouritech.mtevent.mapping;

import java.time.LocalDate;

import com.mouritech.mtevent.dto.EventDto;
import com.mouritech.mtevent.dto.LocationsDto;
import com.mouritech.mtevent.model.Event;
import com.mouritech.mtevent.model.Locations;

public class LocationMapping 
{
	public static LocationsDto mappingToDto(Locations locations)
	{
		
		LocationsDto locationsDto=new LocationsDto(locations.getLocationId(),locations.getLocationName(),locations.getAddressName(),
				locations.getEmail(),locations.getContactNumber(),locations.getCreatedBy(),locations.getUpdatedBy(),locations.getCreatedOn(),
				locations.getUpdatedOn(),locations.getIsActive()
				);
		return locationsDto;
		
	}
	public static Locations mappingToEntity(LocationsDto locationsDto)
	{
		Locations locations=new Locations(locationsDto.getLocationId(),locationsDto.getLocationName(),locationsDto.getAddressName(),
				locationsDto.getEmail(),locationsDto.getContactNumber(),locationsDto.getCreatedBy(),locationsDto.getUpdatedBy(),locationsDto.getCreatedOn(),
				locationsDto.getUpdatedOn(),locationsDto.getIsActive()
				);
		return locations;
	}

}
