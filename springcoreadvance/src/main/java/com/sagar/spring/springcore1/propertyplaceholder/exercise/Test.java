package com.sagar.spring.springcore1.propertyplaceholder.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sagar/spring/springcore1/propertyplaceholder/exercise/wsclientconfig.xml");
		MyService s = (MyService) context.getBean("myservice");
		System.out.println(s);

	}

}
