package com.sagar.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcoreadvance/injecting/interfaces/orderconfig.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();

	}

}
