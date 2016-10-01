package com.rickshaw.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.rickshaw.domain.Order;

@Service
public class OrderService {

	Hashtable<String, Order> orders = new Hashtable<String, Order>();

	public OrderService() {
		Order order = new Order();
		order.setId(1);
		order.setDateCreated(new Date());
		order.setTotal(new BigDecimal(100.00));
		orders.put("1", order);

		order = new Order();
		order.setId(2);
		order.setDateCreated(new Date());
		order.setTotal(new BigDecimal(89.00));
		orders.put("2", order);
	}

	public Order getOrder(String id) {
		if (orders.containsKey(id)) {
			return orders.get(id);
		} else {
			return null;
		}
	}

	public Hashtable<String, Order> getAll() {
		return orders;
	}

}
