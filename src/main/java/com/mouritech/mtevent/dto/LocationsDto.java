package com.mouritech.mtevent.dto;

import java.time.LocalDate;

public class LocationsDto 
{
	
	private Integer locationId;
	private String locationName;
	private String addressName;
	private String email;
	private String contactNumber;
	private Integer createdBy;
	private Integer updatedBy;
	private LocalDate createdOn;
	private LocalDate updatedOn;
	private Boolean isActive;
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	
	public LocationsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocationsDto(Integer locationId, String locationName, String addressName, String email, String contactNumber,
			Integer createdBy, Integer updatedBy, LocalDate createdOn, LocalDate updatedOn, Boolean isActive) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.addressName = addressName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}
	
	

}
