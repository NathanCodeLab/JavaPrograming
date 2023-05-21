package objectRepo;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import supportLib.ReusableLib;

public class AdminUserManagement extends ReusableLib {
	
	
	@Test
	public void testMethod() {
		PageFactory.initElements(driver, DashboardPage.class);
		
		DashboardPage.userName.click();
		waits(5000);
		
	}
}
