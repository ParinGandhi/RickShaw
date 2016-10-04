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
	Hashtable<String, Product> products = new Hashtable<String, Product>();

	@PostConstruct
	public void initializeOrder() {
		Order order = new Order();
		Product product = new Product();
		order.setId(1);
		order.setDateCreated(new Date());
		order.setTotal(new BigDecimal(100.00));
		product.setId(productService.getProduct("1").getId());
		product.setName(productService.getProduct("1").getName());
		product.setNumber(productService.getProduct("1").getNumber());
		product.setPrice(productService.getProduct("1").getPrice());
		products.put("1", product);
		product = new Product();
		product.setId(productService.getProduct("2").getId());
		product.setName(productService.getProduct("2").getName());
		product.setNumber(productService.getProduct("2").getNumber());
		product.setPrice(productService.getProduct("2").getPrice());
		products.put("2", product);
		order.setProducts(products);
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
