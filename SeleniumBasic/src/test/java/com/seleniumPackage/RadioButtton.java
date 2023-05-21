package com.seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtton extends ReusableLibrary {

	public static void validateRadioButton() throws InterruptedException {

		WebElement rdofav = findXpath("//h5[contains(text(),'favorite')]/..//label[text()='Chrome']");
		rdofav.click();

		int value = 2;
		WebElement rdoUns = findXpath("//label[text()='Bengaluru']");
		for (int i = 0; i < value; i++) {
			Thread.sleep(1000);
			rdoUns.click();
		}
		
		
		List<WebElement> listRdo = driver.findElements(By.xpath("//h5[contains(text(),'Find the default')]/..//tr//td//input"));
		for (WebElement w : listRdo) {
			if (w.isSelected()) {
				String attribute = w.getAttribute("value");
				switch (attribute) {
				case "Option1":
					System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Find the default')]/..//label[text()='Chrome']")).getText());
					break;
				case "Option2":
					System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Find the default')]/..//label[text()='Firefox']")).getText());
					break;
				case "Option3":
					System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Find the default')]/..//label[text()='Safari']")).getText());
					break;
				case "Option4":
					System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Find the default')]/..//label[text()='Edge']")).getText());
					break;
					
			}
	}
		}
	}
}
