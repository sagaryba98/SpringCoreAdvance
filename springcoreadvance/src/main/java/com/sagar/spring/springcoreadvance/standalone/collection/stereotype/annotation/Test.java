package com.sagar.spring.springcoreadvance.standalone.collection.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springcoreadvance/standalone/collection/stereotype/annotation/instructorconfig.xml"
);
		Instructor instructor = (Instructor) context.getBean("instructor");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) context.getBean("instructor");
		System.out.println(instructor2);
	
	
		
				

	}

}
