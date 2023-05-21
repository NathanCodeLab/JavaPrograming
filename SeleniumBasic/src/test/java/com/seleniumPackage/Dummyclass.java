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

public class Dummyclass extends ReusableLibrary {

	// static wait

	public void waitS(int sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//implicitly wait
	
	private void waitForObject() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//explicitly wait
	public void waitforobjectvisible(WebElement we) {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(we));
		
	}
	public void waitforobjectinvisible(WebElement we) {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(we));
	}
	
	public void waitforobjectclickable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}
	
	public void waitforobjectseletable(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeSelected(we));
	}
	public void waitforobjectpresence(By we) {
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(we));
	}
	
	 Wait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(30))
			 .pollingEvery(Duration.ofSeconds(5))
			 .ignoring(NoSuchElementException.class);
	
	 
	 
	 public void fluentwawti() {
		 
		 Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		 System.out.println(fwait.toString());
		 
	}

}
