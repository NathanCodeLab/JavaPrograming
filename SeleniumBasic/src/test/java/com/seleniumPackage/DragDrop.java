package com.seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends ReusableLibrary {

	public static void validateDragDrop() {
		// Action - cons overload driver
		// click and hold
		// movetoelement
		// release
		// draganddrop
		// build perform

		WebElement from = driver.findElement(By.id("form:conpnl"));
		WebElement to = driver.findElement(By.xpath("//h4[text()='Draggable']/..//div[@id='form:restrictPanel']"));

		Actions action = new Actions(driver);

		action.clickAndHold(from).moveToElement(to, 100, 0).release().build().perform();
		
		
		WebElement from1 = driver.findElement(By.id("form:drag_content"));
		WebElement to1 = driver.findElement(By.id("form:drop_header"));
		
		action.dragAndDrop(from1, to1).build().perform();
		

	}

}
