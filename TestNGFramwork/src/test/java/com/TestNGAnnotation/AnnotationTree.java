package com.TestNGAnnotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationTree {
	WebDriver driver;
	long startTime;
	Properties prop;

	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void openUrl() {
		driver.get(getProperties("URL"));
	}

	@BeforeMethod
	public void getTestCaseTime() {
		startTime = System.currentTimeMillis();
	}

	@AfterMethod
	public void closeTestCaseTime() {
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime + " MilliSecounds");
	}

	@AfterClass
	public void getCurrentURl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	@AfterSuite
	public void quitBrowser() {
		driver.quit();
	}

	
	
	public String getProperties(String propKey) {
		String rtnProp = null;
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					"/Users/sabarinathan/Documents/Eclipse Project/TestNGFramwork/config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			rtnProp = prop.getProperty(propKey);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return rtnProp;

	}
}
