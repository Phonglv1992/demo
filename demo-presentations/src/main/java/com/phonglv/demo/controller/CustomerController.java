package com.phonglv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phonglv.demo.bussiness.CustomerManager;
import com.phonglv.demo.domain.Customer;


@RestController
public class CustomerController {

//private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerManager customerManager;

	@RequestMapping("/")
	public Customer HomeController() {
		System.out.println(customerManager.getBestCustomer());
		return this.customerManager.getBestCustomer();
	}
	
	
}
