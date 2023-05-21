package com.TestNGAttributes;

import org.testng.annotations.Test;

public class EnabledAtt {
	
	
	// To Skip the TC 
	
	@Test(priority = 0)
	private void firstTC() {
		System.out.println("My First Test Case");
	}
	@Test(priority = 1, enabled = false)
	private void secountTC() {
		System.out.println("My Secount Test Case");
	}
	@Test(priority = 2, enabled=true)
	private void thirdTC() {
		System.out.println("My Third Test Case");
	}
	@Test(priority = 3)
	private void forthTC() {
		System.out.println("My Fourth Test Case");
	}
	@Test(priority = 4)
	private void fifthTC() {
		System.out.println("My Fifth Test Case");
	}
	
	

}
