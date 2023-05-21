package com.TestNGAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableLib extends AnnotationTree {
	
	WebDriverWait wait;
	
	public void enterText(By fieldName, String value) {
		 driver.findElement(fieldName).sendKeys(value);
		
	}
	public void waits(long sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void waitForObjectVisible(WebElement we) {
		wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(we));
	}
	public void  waitForObjectInVisible(WebElement we) {
		wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(we));
	}
	public void waitForObjectTobeClickable(WebElement we) {
		wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}

}
