package com.mouritech.mtevent.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lu_locations")
public class Locations {
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer locationId;
	@Column(name = "location_name")
	private String locationName;
	@Column(name = "address_name")
	private String addressName;
	@Column(name = "email")
	private String email;
	@Column(name = "contact_number")
	private String contactNumber;
	@Column(name = "created_by")
	private Integer createdBy;
	@Column(name = "updated_by")
	private Integer updatedBy;
	@Column(name = "created_on")
	private LocalDate createdOn;
	@Column(name = "updated_on")
	private LocalDate updatedOn;
	@Column(name = "is_active")
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

	public Locations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Locations(Integer locationId, String locationName, String addressName, String email, String contactNumber,
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
