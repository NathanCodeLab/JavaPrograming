package objectRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuClass {

	@Test
public void setUPExecuter() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("alert.dismiss()");
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://matches.tamilmatrimony.com");
	driver.findElement(By.id("MIDP")).sendKeys("9360988003");
	driver.findElement(By.id("PASSWORD2")).sendKeys("Tms1700#");
	driver.findElement(By.className("login-btn")).click();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.get("https://matches.tamilmatrimony.com/whoviewedyou/viewprofile/M9137315");
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	String s=driver.findElement(By.xpath("(//a[@class='pointer ng-star-inserted']//img")).getAttribute("innerText");
	System.out.println(s);
	
	Thread.sleep(10000);
	
	driver.quit();
}

}
