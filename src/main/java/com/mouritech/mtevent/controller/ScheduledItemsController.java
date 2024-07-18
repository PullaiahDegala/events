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

import com.mouritech.mtevent.dto.EventInstancesDto;
import com.mouritech.mtevent.dto.ScheduledItemsDto;
import com.mouritech.mtevent.service.ScheduledItemsService;

@RestController
public class ScheduledItemsController 
{
	@Autowired
	private ScheduledItemsService scheduledItemsService;
	
	@PostMapping("/mt-events/createscheduledItems")
	public ResponseEntity<?> createScheduledItems(@RequestBody ScheduledItemsDto scheduledItemsDto)
	{
		Object response=scheduledItemsService.createScheduledItems(scheduledItemsDto);
		if(response instanceof EventInstancesDto)
		{
			return new ResponseEntity<Object>(response,HttpStatus.OK);
		}
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);	
	}
	@PutMapping("/mt-events/updatescheduledItems")
	public ResponseEntity<?> updateScheduledItems(@RequestBody ScheduledItemsDto scheduledItemsDto)
	{
		Object response=scheduledItemsService.createScheduledItems(scheduledItemsDto);
		if(response instanceof EventInstancesDto)
		{
			return new ResponseEntity<Object>(response,HttpStatus.OK);
		}
		return new ResponseEntity<Object>(response,HttpStatus.BAD_REQUEST);	
	}
	@DeleteMapping("/mt-events/deletescheduledItems")
    public ResponseEntity<?> deleteScheduledItems(@RequestParam(name="scheduledItemId") Integer scheduledItemId)
    {
		Boolean response = scheduledItemsService.deleteScheduledItems(scheduledItemId);
		if(response==true)
		{
			return new ResponseEntity<Boolean>(response,HttpStatus.OK);
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("scheduledItemId is not found");
    	
    }
}
