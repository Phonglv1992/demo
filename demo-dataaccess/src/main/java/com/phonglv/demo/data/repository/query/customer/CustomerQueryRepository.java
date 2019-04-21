package com.phonglv.demo.data.repository.query.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.phonglv.demo.domain.*;

@Component
public interface CustomerQueryRepository extends JpaRepository<Customer, Long> {
	
	Customer getBestCustomer();
	
	String Test();
	
	Customer getById(Long id);
	
	List<Customer> getAll();
		
}
