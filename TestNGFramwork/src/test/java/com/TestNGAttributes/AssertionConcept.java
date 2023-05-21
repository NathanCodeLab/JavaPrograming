package com.TestNGAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	//Mainly used for unit testing for developers
	
	
	String name ="nathan";
	boolean value = true;
	boolean value2= false;
	String s=null;
	
	@Test
	private void validateValues() {

		Assert.assertEquals(name, "nathan");
		Assert.assertNotEquals(name, "Nathan");
		System.out.println("Assert Equals");
		
		
		Assert.assertSame(name, "nathan");
		Assert.assertNotSame(name, "sabari");
		System.out.println("Assert same");
		
		Assert.assertNull(name);
		Assert.assertNotNull(name);
		System.out.println("Assert null");
		
		Assert.assertTrue(value);
		Assert.assertFalse(false);
		System.out.println("Assert boolean");
		
		
	}

}
