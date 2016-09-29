package com.rickshaw.domain;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderItem {

	private long id;
	private int quantity;
	private BigDecimal total;
	
}
