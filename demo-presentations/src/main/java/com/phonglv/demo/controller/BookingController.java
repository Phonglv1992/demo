package com.phonglv.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonglv.demo.data.repository.query.booking.BookingQueryRepository;
import com.phonglv.demo.domain.Booking;

@RestController
public class BookingController {

	@Autowired
	BookingQueryRepository bookingRepository;

	@RequestMapping("/booking")
	Collection<Booking> booking() {
		return bookingRepository.findAll();
	}
}
