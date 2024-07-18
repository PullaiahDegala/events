package com.mouritech.mtevent.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventInstancesDto {
	private Integer eventInstanceId;
	private Integer eventId;
	private Integer locationId;
    @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate endTime;
	private Integer createdBy;
	
	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	private Integer updatedBy;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate createdOn;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate updatedOn;
	private Boolean isActive;

	public Integer getEventInstanceId() {
		return eventInstanceId;
	}

	public void setEventInstanceId(Integer eventInstanceId) {
		this.eventInstanceId = eventInstanceId;
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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public EventInstancesDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventInstancesDto(Integer eventInstanceId, Integer eventId, Integer locationId, LocalDate startTime,
			LocalDate endTime, Integer createdBy, Integer updatedBy, LocalDate createdOn, LocalDate updatedOn,
			Boolean isActive) {
		super();
		this.eventInstanceId = eventInstanceId;
		this.eventId = eventId;
		this.locationId = locationId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}


}