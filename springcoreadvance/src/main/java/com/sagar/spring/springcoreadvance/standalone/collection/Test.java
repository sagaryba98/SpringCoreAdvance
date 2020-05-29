package com.sagar.spring.springcoreadvance.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcoreadvance/standalone/collection/productconfig.xml");
		ProductList p = (ProductList) context.getBean("productlist");
		System.out.println(p);

	}

}
