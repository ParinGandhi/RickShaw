package com.rickshaw.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rickshaw.domain.Customer;
import com.rickshaw.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/all")
	public Hashtable<String, Customer> getAll() {
		return customerService.getAll();
	}
	
	@RequestMapping("{id}")
	public Customer getCustomer (@PathVariable ("id") String id) {
		return customerService.getCustomer(id);
	}
}
