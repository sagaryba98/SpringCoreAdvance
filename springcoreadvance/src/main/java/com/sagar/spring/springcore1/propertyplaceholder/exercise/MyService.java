package com.sagar.spring.springcore1.propertyplaceholder.exercise;

public class MyService {
	private String url;

	public MyService(String url) {
		this.url=url;
	}

	@Override
	public String toString() {
		return "MyService [url=" + url + "]";
	}
	
	
	

}
