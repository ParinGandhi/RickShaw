package com.rickshaw.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Order {

	private long id;
	private Date dateCreated;
	private BigDecimal total;
	
}
