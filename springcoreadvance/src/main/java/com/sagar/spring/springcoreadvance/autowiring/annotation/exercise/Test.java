package com.sagar.spring.springcoreadvance.autowiring.annotation.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcoreadvance/autowiring/annotation/exercise/customerconfig.xml");
	Customer c = (Customer) context.getBean("customer");
	System.out.println(c);
	
}
	
	
}
