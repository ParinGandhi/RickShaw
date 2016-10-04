package com.rickshaw.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {

	private long id;
	private Date dateCreated;
	private BigDecimal total;
	private List<Product> products = new ArrayList<>();
	
}
