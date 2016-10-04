package com.rickshaw.service;

import java.util.Hashtable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickshaw.domain.Customer;

@Service
public class CustomerService {

	@Autowired 
	private OrderService orderService;
	
	Hashtable<String, Customer> customers = new Hashtable<String, Customer>();

	@PostConstruct
	public void initializeCustomer() {
		Customer cust = new Customer();
		cust.setId(1);
		cust.setFirstName("Tom");
		cust.setLastName("Jones");
		customers.put("1", cust);
		customers.get("1").getOrders().add(orderService.getOrder("1"));
		customers.get("1").getOrders().add(orderService.getOrder("2"));
		

		cust = new Customer();
		cust.setId(2);
		cust.setFirstName("Dick");
		cust.setLastName("Smith");
		customers.put("2", cust);
		customers.get("2").getOrders().add(orderService.getOrder("2"));

		cust = new Customer();
		cust.setId(3);
		cust.setFirstName("Harry");
		cust.setLastName("Arnold");
		customers.put("3", cust);
		customers.get("3").getOrders().add(orderService.getOrder("1"));
	}

	public Customer getCustomer(String id) {
		if (customers.containsKey(id)) {
			return customers.get(id);
		} else {
			return null;
		}
	}

	public Hashtable<String, Customer> getAll() {
		return customers;
	}

}
