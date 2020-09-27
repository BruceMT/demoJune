package com.nagendra.junit5;

public class HelloWorldLmp implements HelloWorld {
	@Override
	public String hello(String name) {
		if(name == null || name.length() ==0) {
			throw new IllegalArgumentException();
		}
		
		return "Hello " + name;
	}
}
