package com.mouritech.mtevent.service;

import com.mouritech.mtevent.dto.EventDto;
import com.mouritech.mtevent.dto.response.EventResponse;

public interface EventService 
{
	
	public EventDto setEvents(EventDto eventDto);
	public EventDto updateEvent(EventDto eventDto);
	public Boolean deleteByid(Integer id);
	public EventResponse getEvents(Integer eventId, Integer eventInstanceId, Integer locationId);

}
