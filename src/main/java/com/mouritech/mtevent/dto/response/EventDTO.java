package com.mouritech.mtevent.dto.response;

import java.util.ArrayList;
import java.util.List;

public class EventDTO {
	private Integer eventId;
	private String name;
	private String description;
	private String image;
	List<EventInstancesDTO> instances = new ArrayList<EventInstancesDTO>();

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<EventInstancesDTO> getInstances() {
		return instances;
	}

	public void setInstances(List<EventInstancesDTO> instances) {
		this.instances = instances;
	}

}
