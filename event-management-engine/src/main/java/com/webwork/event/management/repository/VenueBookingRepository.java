package com.webwork.event.management.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwork.event.management.entity.VenueBooking;

public interface VenueBookingRepository extends JpaRepository<VenueBooking, String> {

	VenueBooking findByVenueIdAndDate(String venueId, Date date);

}
