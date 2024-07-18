package com.mouritech.mtevent.dto.response;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScheduledItemsDTO {
	private String name;
	private String notes;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate startTime;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate endTime;

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

}
