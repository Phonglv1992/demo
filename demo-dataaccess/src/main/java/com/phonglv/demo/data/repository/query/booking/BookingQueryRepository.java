package com.phonglv.demo.data.repository.query.booking;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonglv.demo.domain.Booking;

public interface BookingQueryRepository extends JpaRepository<Booking, Long> {

	Collection<Booking> findByBookingName(String bookingName);
}
