package com.rickshaw.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rickshaw.domain.Product;
import com.rickshaw.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
		@Autowired
		private ProductService productService;

		@RequestMapping("/all")
		public Hashtable<String, Product> getAll() {
			return productService.getAll();
		}

		@RequestMapping("{id}")
		public Product getProduct(@PathVariable("id") String id) {
			return productService.getProduct(id);
		}
	
}
