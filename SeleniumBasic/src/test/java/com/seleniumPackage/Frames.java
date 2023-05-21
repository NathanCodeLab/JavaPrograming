package com.seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class Frames extends ReusableLibrary {

	public static void validateFrame() throws InterruptedException {

		// tagName
		// Index 0 1 2 3

		Thread.sleep(2000);

		driver.switchTo().frame(0);

		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.id("Click")).getText());

		driver.switchTo().defaultContent();

		List<WebElement> framecount = driver.findElements(By.xpath("//iframe"));
		int size = framecount.size();
		System.out.println(size);

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();

		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.xpath("//h5[contains(text(),'Inside frame')]")).getText();
		System.out.println(text);

	}

}
