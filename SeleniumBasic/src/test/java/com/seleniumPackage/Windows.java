package com.seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Windows extends ReusableLibrary {
	
	
	
	public static void validateWindows() throws InterruptedException {
		ReusableLibrary oj=new ReusableLibrary();
		
			//click
			//parent window
			//child window
			// switch to parent window
			// close and quit 
			
		String oldwin = driver.getWindowHandle();
		
		driver.findElement(By.id("j_idt88:new")).click();
		
		Set<String> newWin = driver.getWindowHandles();
		//duplicate not accept 
		System.out.println(newWin);
		
		for(String nw:newWin) {
			if (!oldwin.equals(nw)) {
				driver.switchTo().window(nw);
				System.out.println(driver.getTitle());
			}
		}
		
		driver.close();
		driver.switchTo().window(oldwin);
		System.out.println(driver.getTitle());

		driver.findElement(By.id("j_idt88:j_idt95")).click();
		long startTime = System.currentTimeMillis();

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for(String nWin:windowHandles) {
			if (!oldwin.equals(nWin)) {
				driver.switchTo().window(nWin);
			}
		}
		oj.waitForObjectVisible(driver.findElement(By.xpath("//span[text()='Customer Analytics Table']")));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(oldwin);
		System.out.println(driver.getTitle());
		}
	}
//[5F988F51753EA8DD6C1D6A5E4827D4A3, 2661DD131BA27DAC8342BA5450F432AC]
//Dashboard
//Window
//org.openqa.selenium.support.ui.FluentWait@5471388b
//[5F988F51753EA8DD6C1D6A5E4827D4A3, 9EBA19E2D4C69A8A3AF65DCC7151DC00, 9CBAD01107961BF1182C1514CF449758]

