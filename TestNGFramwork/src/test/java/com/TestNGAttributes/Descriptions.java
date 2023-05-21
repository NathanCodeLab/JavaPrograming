package com.TestNGAttributes;

import org.testng.annotations.Test;

public class Descriptions {
	
	@Test(priority = 0, description = "Priority One")
	private void firstTC() {
		System.out.println("My First Test Case");
	}
	@Test(priority = 1, description = "Priority Two")
	private void secountTC() {
		System.out.println("My Secount Test Case");
	}
	@Test(priority = 2, description = "Priority Three")
	private void thirdTC() {
		System.out.println("My Third Test Case");
	}
	@Test(priority = 3, description = "Priority Four")
	private void forthTC() {
		System.out.println("My Fourth Test Case");
	}
	@Test(priority = 4, description = "Priority Five")
	private void fifthTC() {
		System.out.println("My Fifth Test Case");
	}
	

}
