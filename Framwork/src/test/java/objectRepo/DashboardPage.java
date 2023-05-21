package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import supportLib.ReusableLib;

public class DashboardPage extends ReusableLib {
	
	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']//ul//li[1]")
	public static WebElement adminTab;
	
	@FindBy(xpath = "//h6[text()='Admin' and text()='']")
	public static WebElement adminHeading;
	
	@FindBy(xpath = "//label[text()='Username']/..//following-sibling::div//input")
	public static WebElement userName;
	
	@FindBy(xpath="//label[text()='User Role']/..//following-sibling::div//div[text()='-- Select --']")
	public static WebElement userRole;
	
	@FindBy(xpath="//label[text()='Employee Name']/..//following-sibling::div//div//input")
	public static WebElement employeeName;
	
	@FindBy(xpath="//label[text()='status']/..//following-sibling::div//div[text()='-- Select --']")
	public static WebElement status;
	
	@FindBy(xpath="//button[text()=' Search ']")
	public static WebElement btnSearch;
	
	@FindBy(xpath = "//span[text()='(1) Record Found']")
	public static WebElement recordFound;
	
	
}
