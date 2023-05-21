package com.seleniumPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckBox extends ReusableLibrary{
	
	
	
	public static void validateCheckBox() throws InterruptedException{
		
		WebElement chkBasic = findXpath("//h5[contains(text(),'Basic Checkbox')]/..//following-sibling::span");
		chkBasic.click();
		
		WebElement chkAjax = findXpath("//span[contains(text(),'Ajax')]");
		chkAjax.click();
		Thread.sleep(1000);
		WebElement cfmNot = findXpath("//span[contains(text(),'Checked')]");
		if (cfmNot.isDisplayed()) {
			System.out.println("Ajax Notification is displayed");
		}else
			System.out.println("Ajax Notification is Not displayed");
		
		validateCheckBox("Java");
		validateCheckBox("Python");
		validateCheckBox("Javascript");
		validateCheckBox("Others");
		
		WebElement chkD = findXpath("//span[text()='Disabled']");
		System.out.println(chkD.isSelected());
		
	}
	public static void validateCheckBox(String fieldName) throws InterruptedException {
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		WebElement chkMlt = findXpath("//label[text()='"+fieldName+"']/..//div//following-sibling::div//span");
		executor.executeScript("arguments[0].click();", chkMlt);
		Thread.sleep(500);
		
	}

}
