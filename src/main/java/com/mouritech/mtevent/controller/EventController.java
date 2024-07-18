package com.mouritech.mtevent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.mtevent.dto.EventDto;
import com.mouritech.mtevent.dto.response.EventResponse;
import com.mouritech.mtevent.service.EventService;

@RestController
public class EventController 
{
	@Autowired
	private EventService eventService;
	
	@PostMapping("/mt-events/event")
	public ResponseEntity<?> setEvents(@RequestBody EventDto eventDto)
	{
		EventDto response=eventService.setEvents(eventDto);
		return new ResponseEntity<EventDto>(response,HttpStatus.OK);
		
	}
	@PutMapping("/mt-events/updateevent")
	public ResponseEntity<?> updateEvent(@RequestBody EventDto eventDto)
	{
		EventDto response=eventService.setEvents(eventDto);
		return new ResponseEntity<EventDto>(response,HttpStatus.OK);	
	}
	@DeleteMapping("/mt-events/deleteeevent")
	public ResponseEntity<?> deleteEvent(@RequestParam(name="eventId") Integer eventId)
	{
		Boolean response = eventService.deleteByid(eventId);
		if(response==true)
		{
			return new ResponseEntity<Boolean>(response,HttpStatus.OK);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("eventId is not found");
		
	}
	
	
	
	
	
		
	@GetMapping("events")
	public ResponseEntity<EventResponse> getEvents(@RequestParam(name = "eventId", required = false) Integer eventId,
			@RequestParam(name = "eventInstanceId", required = false) Integer eventInstanceId,
			@RequestParam(name = "locationId", required = false) Integer locationId,
			@RequestParam(name = "ALL", required = false, defaultValue = "ALL") String ALL) {
		    EventResponse response = eventService.getEvents(eventId, eventInstanceId, locationId);
		if (response != null) {
			return new ResponseEntity<EventResponse>(response, HttpStatus.OK);
		}
		return null;

	}
	

}
