package com.rickshaw.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Hashtable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rickshaw.domain.Order;
import com.rickshaw.domain.Product;

@Service
public class OrderService {

	@Autowired
	private ProductService productService;
	
	Hashtable<String, Order> orders = new Hashtable<String, Order>();

	@PostConstruct
	public void initializeOrder() {
		Order order = new Order();
		order.setId(1);
		order.setDateCreated(new Date());
		order.setTotal(new BigDecimal(100.00));
		orders.put("1", order);
		orders.get("1").getProducts().add(productService.getProduct("1"));
		orders.get("1").getProducts().add(productService.getProduct("2"));
		orders.get("1").getProducts().add(productService.getProduct("5"));

		order = new Order();
		order.setId(2);
		order.setDateCreated(new Date());
		order.setTotal(new BigDecimal(89.00));
		orders.put("2", order);
		orders.get("2").getProducts().add(productService.getProduct("3"));
		orders.get("2").getProducts().add(productService.getProduct("4"));
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
