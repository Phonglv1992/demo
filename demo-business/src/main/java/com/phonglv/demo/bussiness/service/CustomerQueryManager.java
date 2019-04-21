package com.phonglv.demo.bussiness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phonglv.demo.data.repository.query.customer.CustomerQueryRepository;
import com.phonglv.demo.domain.Customer;

@Component
public class CustomerQueryManager {
	
	@Autowired
	CustomerQueryRepository customerQueryRepository;
	
	public Customer getBestCus() {
		return customerQueryRepository.getBestCustomer();
	}

}
