package com.seleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertConcept extends ReusableLibrary{
	
	public static void validateAlert() throws InterruptedException {

		
		WebElement alertBox = findXpath("(//span[contains(text(),'Show')])[1]");
		alertBox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement alertbox2 = findXpath("(//span[contains(text(),'Show')])[2]");
		alertbox2.click();
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		WebElement alertbox3 = findXpath("(//span[contains(text(),'Show')])[3]");
		alertbox3.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		WebElement alertbox4 = findXpath("(//span[contains(text(),'Show')])[4]");
		alertbox4.click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		
	}

}
