package com.seleniumPackage;

import java.io.FileInputStream;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

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

	public static void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		switch (getProperties("browser")) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "FF":
			driver = new FirefoxDriver();
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			driver = new ChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get(getProperties("Url"));
	}

	public static String getProperties(String propKey) {
		String rtnProp = "";
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(
					"/Users/sabarinathan/Documents/Eclipse Project/SeleniumBasic/GlobalSetting.properties");
			prop.load(file);

			rtnProp = prop.getProperty(propKey);

		} catch (Exception ioexException) {
			System.out.println("IOException in properties");
		}
		return rtnProp;
	}

}
