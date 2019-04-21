package com.phonglv.demo.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phonglv.demo.bussiness.service.CustomerQueryManager;
import com.phonglv.demo.domain.Customer;

@Component
public class CustomerManager {
	
	@Autowired
	private CustomerQueryManager customerQueryManager;
	
	public Customer getBestCustomer() {
		return customerQueryManager.getBestCus();
	}

}
