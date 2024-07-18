package com.mouritech.mtevent.dto.response;

import java.util.ArrayList;
import java.util.List;


public class EventResponse {

	List<EventDTO> events = new ArrayList<EventDTO>();

	public List<EventDTO> getEvents() {
		return events;
	}

	public void setEvents(List<EventDTO> events) {
		this.events = events;
	}


}
