package com.sagar.spring.springcoreadvance.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcoreadvance/autowiring/annotation/config.xml");

		Employee e= (Employee) context.getBean("employee");
		System.out.println(e);
		
	}

}
