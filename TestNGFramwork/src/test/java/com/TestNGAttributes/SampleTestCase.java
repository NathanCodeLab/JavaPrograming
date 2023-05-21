package com.TestNGAttributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void helloWorld() {
		System.out.println("Hello World");
	}
	
	@Test
	@Parameters({"name","age"})
	public void aMyFirstTC(String name,String age) {
		System.out.println("My First Test Case parameterization "+name+" and age is : "+age);
	}

}
