package com.mouritech.mtevent.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "scheduled_items")
public class ScheduledItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "scheduled_items_id")
	private Integer scheduledItemId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_instance_id", nullable = false)
	private EventInstances eventInstanceId;
	@Column(name = "name")
	private String name;
	@Column(name = "notes")
	private String notes;
	@Column(name = "start_time")
	private LocalDate startTime;
	@Column(name = "end_time")
	private LocalDate endTime;
	@Column(name = "created_by")
	private Integer createdBy;
	@Column(name = "updated_by")
	private Integer updatedBy;
	@Column(name = "created_on")
	@UpdateTimestamp
	private LocalDate createdOn;
	@Column(name = "updated_on")
	@UpdateTimestamp
	private LocalDate updatedOn;
	@Column(name = "is_active")
	private Boolean isActive;

	public Integer getScheduledItemId() {
		return scheduledItemId;
	}

	public void setScheduledItemId(Integer scheduledItemId) {
		this.scheduledItemId = scheduledItemId;
	}

	public EventInstances getEventInstanceId() {
		return eventInstanceId;
	}

	public void setEventInstanceId(EventInstances eventInstanceId) {
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

	public ScheduledItems() {

	}

	public ScheduledItems(Integer scheduledItemId, EventInstances eventInstanceId, String name, String notes,
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
