package com.rickshaw.service;

import java.math.BigDecimal;
import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.rickshaw.domain.Order;
import com.rickshaw.domain.Product;

@Service
public class ProductService {

	Hashtable<String, Product> products = new Hashtable<String, Product>();

	public ProductService() {
		Product product = new Product();
		product.setId(1);
		product.setName("Starter Handle");
		product.setNumber("INPK1947");
		product.setPrice(new BigDecimal(89.99));
		products.put("1", product);

		product = new Product();
		product.setId(2);
		product.setName("Tire");
		product.setNumber("INPK1948");
		product.setPrice(new BigDecimal(54.67));
		products.put("2", product);

		product = new Product();
		product.setId(3);
		product.setName("Steering Handle");
		product.setNumber("INPK1949");
		product.setPrice(new BigDecimal(129.55));
		products.put("3", product);

		product = new Product();
		product.setId(4);
		product.setName("Headlight");
		product.setNumber("INPK1950");
		product.setPrice(new BigDecimal(69.99));
		products.put("4", product);

		product = new Product();
		product.setId(5);
		product.setName("Bumper");
		product.setNumber("INPK1951");
		product.setPrice(new BigDecimal(79.99));
		products.put("5", product);

	}
	
	public Product getProduct(String id) {
		if (products.containsKey(id)) {
			return products.get(id);
		} else {
			return null;
		}
	}

	public Hashtable<String, Product> getAll() {
		return products;
	}
}
