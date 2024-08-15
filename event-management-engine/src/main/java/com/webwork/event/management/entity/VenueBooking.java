package com.webwork.event.management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venuebooking")
public class VenueBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "venueId")
	private String venueId;
	
	@Column(name = "venueName")
	private String venueName;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "date")
	private Date date;

	public VenueBooking() {
	}

	public VenueBooking(String venueId, String venueName, int userId, Date date) {
		this.venueId = venueId;
		this.venueName = venueName;
		this.userId = userId;
		this.date = date;
	}

	public VenueBooking(String id, String venueId, String venueName, int userId, Date date) {
		this.id = id;
		this.venueId = venueId;
		this.venueName = venueName;
		this.userId = userId;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "VenueBooking [id=" + id + ", venueId=" + venueId + ", venueName=" + venueName + ", userId=" + userId
				+ ", date=" + date + "]";
	}

	
	
	

}
