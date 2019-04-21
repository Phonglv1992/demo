package com.phonglv.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonglv.demo.bussiness.CustomerManager;

@RestController
public class TestController extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private CustomerManager customerManager;

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
