package com.bussinessComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.*;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScriptHelper {

	private ScriptHelper single_instance = null;

	public ScriptHelper() {
	}

	public ScriptHelper getInstance() {
		if (single_instance == null) {
			single_instance = new ScriptHelper();
		}
		return single_instance;

	}

	public static WebDriver driver;

	// file handling

	public static String getProperties(String field) {
		String rtnProp = "";
		try {
			Properties prop = new Properties();
			File file = new File("/Users/sabarinathan/Documents/Eclipse Project/DemoSelenium/config.properties");
			FileInputStream stream = new FileInputStream(file);
			prop.load(stream);
			rtnProp = prop.getProperty(field);

		} catch (Exception ioexException) {
			System.out.println("IO Exception");
		}
		return rtnProp;
	}

	public static void initializeDriver() {
		switch (getProperties("browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FF":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get(getProperties("Url"));
	}

}
