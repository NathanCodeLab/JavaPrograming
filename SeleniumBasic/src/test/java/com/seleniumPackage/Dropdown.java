package com.seleniumPackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends ReusableLibrary {

	public static void validateDropdown() throws InterruptedException {

		WebElement dpd = driver.findElement(By.className("ui-selectonemenu"));

		Select select = new Select(dpd);

		select.selectByIndex(0);
		select.selectByVisibleText("Playwright");

		List<WebElement> dpdList = driver.findElements(By.xpath("//select[@class='ui-selectonemenu']//option"));

		for (WebElement d : dpdList) {
			String text = d.getText();
			System.out.println(text);
		}

		validateDropdown("Appium");
		validateDropdown("Playwright");
		validateDropdown("AWS");
		validateDropdow();

	}
	public static void validateDropdown(String fieldName) throws InterruptedException {
		WebElement dpdTxt = driver.findElement(By.id("j_idt87:auto-complete_input"));
		dpdTxt.sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-item-value='"+fieldName+"']")).click();
		Thread.sleep(2000);
		
	}
	public static void validateDropdow() throws InterruptedException {
		WebElement dpdTxt = driver.findElement(By.xpath("//label[contains(text(),'Select Language')]"));
		dpdTxt.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();
		Thread.sleep(2000);
		
	}
	
	
}
