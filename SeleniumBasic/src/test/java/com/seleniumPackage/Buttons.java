package com.seleniumPackage;

import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Buttons extends ReusableLibrary {
	
	public void validateButtons() throws InterruptedException {
		initializeDriver();

		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		
		String title=getTitle();
		
		if (title.equals("Dashboard")) {
			System.out.println("valid Title");
		}else
		System.out.println("Invalid Title");
		driver.navigate().back();
		Thread.sleep(2000);
		
		boolean confirm=driver.findElement(By.xpath("//h5[contains(text(),'Confirm if the ')]/..//button")).isEnabled();
		WebElement findElement = driver.findElement(By.cssSelector("//h5[contains(text(),'Confirm if the ')]/..//button"));
		
		
		// get position of the button
		Point location = findElement.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("X value is : "+x+" y  value is : "+y);
		
		String value = findElement.getCssValue("background-colour");
		System.out.println(value);
		
		// get size of the button
		int height = findElement.getSize().getHeight();
		int width = findElement.getSize().getWidth();
		System.out.println("Height is : "+height+" Width is : "+width);
		
		
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(value)
		
		
	}
	
	

}
