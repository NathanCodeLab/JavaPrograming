package com.seleniumPackage;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOption  {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//		options.addArguments("disable-notifications");
//		options.addArguments("disable-geolocation");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.1tamilmv.bio/");
		
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}

}
