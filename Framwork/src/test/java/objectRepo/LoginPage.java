package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import supportLib.ReusableLib;

public class LoginPage extends ReusableLib {

	@FindBy(name = "username")
	public static WebElement username;

	@FindBy(name = "password")
	public static WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	public static WebElement loginButton;
	
	
	
	
	
	

//	public static void uname() {
//		username.sendKeys(getProperties("Username"));
//	}
//
//	public static void pword() {
//		password.sendKeys(getProperties("Password"));
//	}

	public static void btnlogin() {
		LoginPage.loginButton.click();
	}

}
