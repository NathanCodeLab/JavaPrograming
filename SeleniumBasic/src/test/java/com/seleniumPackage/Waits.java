package com.seleniumPackage;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends ReusableLibrary {
	
	public static void validateWaits(){
		//1. Pageload timeout
		//2. Implicitly wait - global wait
		//3. Explicitly wait
		//4. Fluent wait
		
		
		//pageload.
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//Implicitly wait - applicable for all the webelements
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement we = driver.findElement(By.xpath(""));
		
		//Explicitly wait
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(we));
		wait.until(ExpectedConditions.invisibilityOf(we));
		wait.until(ExpectedConditions.presenceOfElementLocated((By) we));
		wait.until(ExpectedConditions.elementToBeClickable(we));
		wait.until(ExpectedConditions.elementToBeSelected(we));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(we));
		
		
		//fluent wait
		
		 Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		
		
	}

}
