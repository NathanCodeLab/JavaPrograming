package com.TestNGAttributes;

import org.testng.annotations.Test;

public class DependOnMethod {
	
	@Test(enabled=true)
	private void schooling() {
		System.out.println("10th passed");
	}
	@Test(dependsOnMethods = "schooling")
	private void hrStd() {
		System.out.println("12th passed");
	}
	@Test(dependsOnMethods = "hrStd")
	private void ugDg() {
		System.out.println("First class in UG Degree");
	}
	@Test(dependsOnMethods = "ugDg")
	private void pgDg() {
		System.out.println("First class in PG Degree");
	}
	@Test(dependsOnMethods = "pgDg")
	private void phd() {
		System.out.println("Phd in oxford University");
	}
	

}
