package com.webwork.event.management.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.webwork.event.management.enums.EventType;

public class VenueDTO {
	

	@Id
	private String id;
	
	@NotBlank(message = "Name Should not be Empty")
	private String name;

	@NotNull(message = "Address Should not be Empty")
	private Address address;

	@NotNull(message = "Images Should not be Empty.")
	private String imagesFile;

	@Enumerated(EnumType.STRING)
	private EventType eventType;

	@NotNull(message = "peopleCapacity Should not be Empty.")
	private int peopleCapacity;

	@NotNull(message = "rent Should not be Empty.")
	private float rent;

	@NotNull(message = "bookingId Should not be Empty.")
	private String bookingId;

	public VenueDTO() {
		super();
	}

	public VenueDTO(String id, @NotBlank(message = "Name Should not be Empty") String name,
			@NotNull(message = "Address Should not be Empty") Address address,
			@NotNull(message = "Images Should not be Empty.") String imagesFile, EventType eventType,
			int peopleCapacity, float rent, String bookingId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.imagesFile = imagesFile;
		this.eventType = eventType;
		this.peopleCapacity = peopleCapacity;
		this.rent = rent;
		this.bookingId = bookingId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getImagesFile() {
		return imagesFile;
	}

	public void setImagesFile(String imagesFile) {
		this.imagesFile = imagesFile;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public int getPeopleCapacity() {
		return peopleCapacity;
	}

	public void setPeopleCapacity(int peopleCapacity) {
		this.peopleCapacity = peopleCapacity;
	}

	public float getRent() {
		return rent;
	}

	public void setRent(float rent) {
		this.rent = rent;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "VenueDTO [id=" + id + ", name=" + name + ", address=" + address + ", imagesFile=" + imagesFile
				+ ", eventType=" + eventType + ", peopleCapacity=" + peopleCapacity + ", rent=" + rent + ", bookingId="
				+ bookingId + "]";
	}
	



}
