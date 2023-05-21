package businessComponents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepo.DashboardPage;
import supportLib.ReusableLib;

public class Dashboard extends ReusableLib {
	
	
	@Test(priority = 1, enabled=false)
	public void validateTitle() {
		String title = getTitle();
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority = 2,enabled=false)
	public void validateAdminPage() {
		PageFactory.initElements(driver, DashboardPage.class);
		WebElement adminTab=driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//ul//li[1]"));
		adminTab.click();
		waits(5000);
		
		
	}
	@Test(priority = 3,enabled= false)
	public void editSystemuser() throws AWTException {
		
		WebElement recordAccount = driver.findElement(By.xpath("//span[text()='(1) Record Found']"));
		
		waitForObjectVisible(recordAccount);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", recordAccount);
		waits(5000);
	}
	
	

}
