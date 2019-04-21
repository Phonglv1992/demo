package com.phonglv.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.phonglv.demo.data.repository.query.booking.BookingQueryRepository;
import com.phonglv.demo.domain.Booking;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	
	@Component
	class BookingCommandLineRunner implements CommandLineRunner{
		@Autowired
		BookingQueryRepository bookingQueryRepository;
		
		@Override
		public void run(String... args) throws Exception {		
			for(Booking b : this.bookingQueryRepository.findAll()) 
				System.out.println(b.toString());
			
		}

	}

}
