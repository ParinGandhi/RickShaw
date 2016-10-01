package com.rickshaw.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.rickshaw.domain.Customer;

@Service
public class CustomerService {

	/*
	 * @Autowired private OrderService orderService;
	 */

	OrderService orderService = new OrderService();

	Hashtable<String, Customer> customers = new Hashtable<String, Customer>();

	public CustomerService() {
		Customer cust = new Customer();
		cust.setId(1);
		cust.setFirstName("Tom");
		cust.setLastName("Jones");
		cust.setOrders(orderService.getOrder("1"));
		customers.put("1", cust);

		cust = new Customer();
		cust.setId(2);
		cust.setFirstName("Dick");
		cust.setLastName("Smith");
		cust.setOrders(orderService.getOrder("1"));
		customers.put("2", cust);

		cust = new Customer();
		cust.setId(3);
		cust.setFirstName("Harry");
		cust.setLastName("Arnold");
		cust.setOrders(orderService.getOrder("1"));
		customers.put("3", cust);
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
