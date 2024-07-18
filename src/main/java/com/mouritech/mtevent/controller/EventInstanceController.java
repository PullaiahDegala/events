package com.mouritech.mtevent.controller;

import org.hibernate.boot.jaxb.hbm.spi.Adapter4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.mtevent.dto.EventInstancesDto;
import com.mouritech.mtevent.service.EventInstancesService;

@RestController
public class EventInstanceController {
	@Autowired
	private EventInstancesService eventInstanceService;

	@PostMapping("/mt-events/createeventInstance")
	public ResponseEntity<?> saveEventInstances(@RequestBody EventInstancesDto eventInstancesDto) {
		Object response = eventInstanceService.createEventInstances(eventInstancesDto);
		if (response instanceof EventInstancesDto) {
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		}
		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);

	}
	@PutMapping("/mt-events/updateeventInstance")
	public ResponseEntity<?> updateEventInstances(@RequestBody EventInstancesDto eventInstancesDto) {
		Object response = eventInstanceService.createEventInstances(eventInstancesDto);
		if (response instanceof EventInstancesDto) {
			return new ResponseEntity<Object>(response, HttpStatus.OK);
		}
		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);

	}
	
	
	
	@DeleteMapping("/mt-events/deleteeventInstance")
	public ResponseEntity<?> deleteById(@RequestParam(name="eventInstanceId") Integer eventInstanceId)
	{
		
		Boolean response = eventInstanceService.deleteById(eventInstanceId);
		if(response=true)
		{
			return new ResponseEntity<Boolean>(response,HttpStatus.OK);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("eventInstanceId is not found");
		
	}
}
