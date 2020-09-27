package com.nagendra.junit5;



/*import org.junit.After;
import org.junit.Before;*/
//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldLmpTest {
	
	private HelloWorld h ;
	@BeforeEach
	public void setup() {
		System.out.println("SetUP Method");
		h = new  HelloWorldLmp();
	}
	
	@Test
	public void helloWorldShouldReturnValidOutput() {
		System.out.println("Hello Folks, Welcome to Marlabs");
		//HelloWorld h = new  HelloWorldLmp();
		String result = h.hello("Junit");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello Junit",result);
	}
	@Test
	public void helloWorld_Should_Throw_Exception_Not_Null() {
		System.out.println("helloWorld_Should_Throw_Exception if name is Null");
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			h.hello(null);
		});
		
	}
	
	@Test
	public void helloWorld_Should_Throw_Exception_Not_Blank() {
		System.out.println("helloWorld_Should_Throw_Exception if name is Blank");
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			h.hello("");
		});
	}
	@AfterEach
	public void tearddown() {
		System.out.println("TearDown Method");
		h = null;
	}
}
