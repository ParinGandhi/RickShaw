package com.rickshaw.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Product {

	private int id;
	private String name;
	private String number;
	private BigDecimal price;
	
}
