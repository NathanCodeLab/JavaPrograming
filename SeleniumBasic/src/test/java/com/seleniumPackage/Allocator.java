package com.seleniumPackage;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

public class Allocator extends ReusableLibrary {

	public static void main(String[] args) throws InterruptedException, AWTException {
		initializeDriver();
		Windows.validateWindows();
		Thread.sleep(5000);
		driver.quit();
	}

}
