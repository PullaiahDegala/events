package com.mouritech.mtevent.dto;

import java.time.LocalDate;

public class EventDto 
{
	private Integer eventId;
	private String name;
	private String description;
	private String image;
	private Integer createdBy;
	private Integer updatedBy;
	private LocalDate createdOn;
	private LocalDate updatedOn;
	private Boolean isActive;

	
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
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public EventDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventDto(Integer eventId, String name, String description, String image, Integer createdBy,
			Integer updatedBy, LocalDate createdOn, LocalDate updatedOn, Boolean isActive) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.description = description;
		this.image = image;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}
	
	
}
