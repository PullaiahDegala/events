package com.mouritech.mtevent.mapping;

import com.mouritech.mtevent.dto.EventDto;
import com.mouritech.mtevent.model.Event;

public class EventMapping 
{
	public static EventDto mappingToDto(Event event)
	{
		
		EventDto eventDto=new EventDto(event.getEventId(),event.getName(),event.getDescription(),event.getImage(),event.getCreatedBy(),event.getUpdatedBy()
				,event.getCreatedOn(),event.getUpdatedOn(),event.getIsActive());
		return eventDto;
		
	}
	public static Event mappingToEntity(EventDto eventDto)
	{
		Event event=new Event(eventDto.getEventId(),eventDto.getName(),eventDto.getDescription(),eventDto.getImage(),eventDto.getCreatedBy(),eventDto.getUpdatedBy()
				,eventDto.getCreatedOn(),eventDto.getUpdatedOn(),eventDto.getIsActive());
		
		
		return event;
		
	}

}
