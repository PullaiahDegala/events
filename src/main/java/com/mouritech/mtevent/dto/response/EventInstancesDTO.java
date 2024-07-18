package com.mouritech.mtevent.dto.response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mouritech.mtevent.model.EventInstances;

public class EventInstancesDTO {
	private Integer eventInstanceId;
	private String locationName;
	private LocalDate startTime;
	private LocalDate endTime;
	private List<ScheduledItemsDTO> scheduledItems = new ArrayList<ScheduledItemsDTO>();

	public Integer getEventInstanceId() {
		return eventInstanceId;
	}

	public void setEventInstanceId(Integer eventInstanceId) {
		this.eventInstanceId = eventInstanceId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public List<ScheduledItemsDTO> getScheduledItems() {
		return scheduledItems;
	}

	public void setScheduledItems(List<ScheduledItemsDTO> scheduledItems) {
		this.scheduledItems = scheduledItems;
	}

	

}
