package com.webwork.event.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webwork.event.management.dto.Address;
import com.webwork.event.management.enums.EventType;

@Entity
@Table(name = "venue")
public class Venue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private Address address;

	@Column(name = "imageFile")
	private String imagesFile;

	@Enumerated(EnumType.STRING)
	@Column(name = "eventType")
	private EventType eventType;

	@Column(name = "peopleCapacity")
	private int peopleCapacity;

	@Column(name = "rent")
	private float rent;

	@Column(name = "bookingId")
	private String bookingId;

	public Venue() {
	}

	public Venue(String id, String name, Address address, String imagesFile, EventType eventType, int peopleCapacity,
			float rent, String bookingId) {
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
		return "Venue [id=" + id + ", name=" + name + ", address=" + address + ", imagesFile=" + imagesFile
				+ ", eventType=" + eventType + ", peopleCapacity=" + peopleCapacity + ", rent=" + rent + ", bookingId="
				+ bookingId + "]";
	}
	
	



}
