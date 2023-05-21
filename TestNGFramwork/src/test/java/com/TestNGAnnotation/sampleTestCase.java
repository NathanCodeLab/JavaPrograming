package com.TestNGAnnotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class sampleTestCase extends ReusableLib{
	
	@Test
	public void validateInput() {
		enterText(By.id("j_idt88:name"), "sabari");
	}
	
}
