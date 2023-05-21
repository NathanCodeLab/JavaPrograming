package com.seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LinkText extends ReusableLibrary {
	
	
	public void validateLink() {
		
		initializeDriver();
		
		
		//link text
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().back();
		
		String s=driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href");
		
		System.out.println(s);
		int count=0;
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement l:list) {
			System.out.println(l.getAttribute("href"));
			count = count+1;
		}
		System.out.println(count);
		
		
		WebElement d= driver.findElement(By.tagName("a"));
		System.out.println(d.getAttribute("href"));
		
	}

}
