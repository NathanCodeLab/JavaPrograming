package supportLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableLib extends ScriptHelper{
	
	
	public String getTitle( ) {
	return driver.getTitle();
	
	}
	public void waits(int sec) {
		try {
			Thread.sleep(sec);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void waitForObjectVisible(WebElement we) {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(we));
	}

}
