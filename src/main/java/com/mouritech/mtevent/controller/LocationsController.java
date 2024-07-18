package com.mouritech.mtevent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.mtevent.dto.LocationsDto;
import com.mouritech.mtevent.service.LocationsService;

@RestController
public class LocationsController 
{
	@Autowired
	private LocationsService locationService;
	@PostMapping("/mt-events/createlocations")
	public ResponseEntity<?> createLocations(@RequestBody LocationsDto locationsDto)
	{
		LocationsDto response=locationService.setLocations(locationsDto);
		return new ResponseEntity<LocationsDto>(response,HttpStatus.OK);
		
	}
	@PutMapping("/mt-events/updatelocations")
	public ResponseEntity<?> updateLocations(@RequestBody LocationsDto locationsDto)
	{
		LocationsDto response=locationService.setLocations(locationsDto);
		return new ResponseEntity<LocationsDto>(response,HttpStatus.OK);
		
	}
	@DeleteMapping("/mt-events/deletelocations")
	public ResponseEntity<?> deleteLocations(@RequestParam(name="locationId") Integer locationId )
	{
		Boolean response = locationService.deleteLocations(locationId);
		if(response==true)
		{
			return new ResponseEntity<Boolean>(response,HttpStatus.OK);
		}
		return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("location id is not found");
		
	}

}
