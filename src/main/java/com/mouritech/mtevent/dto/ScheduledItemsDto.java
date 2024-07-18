package com.mouritech.mtevent.dto;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScheduledItemsDto 
{
	private Integer scheduledItemId;
	private Integer eventInstanceId;
	private String name;
	private String notes;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startTime;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate endTime;
	private Integer createdBy;
	private Integer updatedBy;
	@UpdateTimestamp
	private LocalDate createdOn;
	@UpdateTimestamp
	private LocalDate updatedOn;
	private Boolean isActive;
	public Integer getScheduledItemId() {
		return scheduledItemId;
	}
	public void setScheduledItemId(Integer scheduledItemId) {
		this.scheduledItemId = scheduledItemId;
	}
	
	public Integer getEventInstanceId() {
		return eventInstanceId;
	}
	public void setEventInstanceId(Integer eventInstanceId) {
		this.eventInstanceId = eventInstanceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
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
	public ScheduledItemsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledItemsDto(Integer scheduledItemId, Integer eventInstanceId, String name, String notes,
			LocalDate startTime, LocalDate endTime, Integer createdBy, Integer updatedBy, LocalDate createdOn,
			LocalDate updatedOn, Boolean isActive) {
		super();
		this.scheduledItemId = scheduledItemId;
		this.eventInstanceId = eventInstanceId;
		this.name = name;
		this.notes = notes;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}
	

}
