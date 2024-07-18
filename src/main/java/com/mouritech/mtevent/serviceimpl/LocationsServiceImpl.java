package com.mouritech.mtevent.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.mtevent.dao.LocationsRepository;
import com.mouritech.mtevent.dto.LocationsDto;
import com.mouritech.mtevent.mapping.LocationMapping;
import com.mouritech.mtevent.model.Locations;
import com.mouritech.mtevent.service.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService
{
	@Autowired
	private LocationsRepository locationrepository;

	@Override
	public LocationsDto setLocations(LocationsDto locationsDto)
	{
		Locations location=LocationMapping.mappingToEntity(locationsDto);
		Locations response=locationrepository.save(location);
		LocationsDto responseDto=LocationMapping.mappingToDto(response);
		
		return responseDto;
	}

	@Override
	public LocationsDto updateetLocations(LocationsDto locationsDto) {
		Locations location=LocationMapping.mappingToEntity(locationsDto);
		Locations response=locationrepository.save(location);
		LocationsDto responseDto=LocationMapping.mappingToDto(response);
		
		return responseDto;
		
	}

	@Override
	public Boolean deleteLocations(Integer id)
	{
		Optional<Locations> optionLocation = locationrepository.findById(id);
		if(optionLocation.isPresent())
		{
			Locations locations=optionLocation.get();
			locations.setIsActive(false);
			locationrepository.save(locations);
			return true;
		}
		return null;
	}

	

}
