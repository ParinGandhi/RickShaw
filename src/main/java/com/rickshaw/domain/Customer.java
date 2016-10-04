package com.rickshaw.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Customer {

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<Order> orders = new ArrayList<>();

}
