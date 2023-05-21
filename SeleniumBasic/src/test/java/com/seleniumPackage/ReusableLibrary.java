package com.seleniumPackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableLibrary extends ScriptHelper {
	ScriptHelper instance = getInstance();
	WebDriverWait wait;

	public static WebElement findXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public String getText(String element) {
		return driver.findElement(By.xpath(element)).getText();
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public WebElement enterText(String element, String value) {
		WebElement txtelement = driver.findElement(By.id(element));
		txtelement.click();
		txtelement.sendKeys(value);
		return txtelement;
	}

	public void waits(long sec) {
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForObjectVisible(WebElement we) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(we));
	}

	public void waitForObjectInVisible(WebElement we) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(we));
	}

	public void waitForObjectTobeClickable(WebElement we) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}

	public void waitforobjectseletable(WebElement we) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeSelected(we));
	}

	public void waitforobjectpresence(By we) {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(we));
	}

	public void fluentWait() {

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		System.out.println(fwait.toString());

	}

}
