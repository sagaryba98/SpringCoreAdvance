package com.sagar.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAO2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO2");

	}

}
