package com.rickshaw.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rickshaw.domain.Order;
import com.rickshaw.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/all")
	public Hashtable<String, Order> getAll() {
		return orderService.getAll();
	}

	@RequestMapping("{id}")
	public Order getOrder(@PathVariable("id") String id) {
		return orderService.getOrder(id);
	}

}
