package supportLib;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.LoginPage;

public class ScriptHelper {
	public WebDriver driver;
	long startTime;

	@BeforeSuite
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeClass
	public void setUPExecuter() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("alert.dismiss()");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(getProperties("Url"));
	}


	@BeforeMethod
	public void currentTime() {
		startTime = System.currentTimeMillis();
	}

	@AfterMethod
	public void currentTimeAfter() {
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time take to run current method : " + (endTime - startTime));
	}

	@AfterTest
	public void afterGetCurrentURL() {
		System.out.println(driver.getCurrentUrl());
	}

	@AfterSuite
	public void endExecution() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	public static String getProperties(String propKey) {
		String rtnProp = "";
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(
					"/Users/sabarinathan/Documents/Eclipse Project/Framwork/GlobalSettings.properties");
			prop.load(file);

			rtnProp = prop.getProperty(propKey);

		} catch (Exception ioexException) {
			System.out.println("IOException in properties");
		}
		return rtnProp;
	}
	@Test    
	@Parameters({"uName","pWord"})
	public void invokeAdminLogin(String uName,String pWord) {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys(uName);
		LoginPage.password.sendKeys(pWord);
		LoginPage.btnlogin();
	}

}
