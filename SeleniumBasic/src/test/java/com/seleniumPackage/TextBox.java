package com.seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextBox extends ReusableLibrary {
	
	public void validateTile() {
		initializeDriver();
		
		enterText("j_idt88:name","sabari");
		enterText("j_idt88:j_idt91", "sabari");
		
		
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(enabled);
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		String attribute = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(attribute);
		
		
		WebElement txtemail = driver.findElement(By.id("j_idt88:j_idt99"));
		txtemail.sendKeys("sabari@gmail.com"+Keys.TAB);
		String txtPlace = driver.findElement(By.id("j_idt88:j_idt101")).getAttribute("placeholder");
		
		if (txtPlace.equals("About yourself")) {
			System.out.println("Yes cursor is moved");
		}else {
			System.out.println("Yes cursor is Not moved");
		}
		String num="30";
		WebElement txtEle = enterText("j_idt106:slider", num);
		WebElement ratio = driver.findElement(By.xpath("//div[@id='j_idt106:j_idt120']//div"));
		String style = ratio.getAttribute("style");
		System.out.println(style);
		String substring = style.substring(7, 10);
		Float parseInt = Float.parseFloat(substring);
		Float value = parseInt*10;
		String string = value.toString();
		String concat = num.concat(".0");
		System.out.println(concat);
		if (concat.equals(string)) {
			System.out.println("valid");
		}
		
		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("5/4/2020");
		
		String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getAttribute("innerText");
		String text2 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getAttribute("innerText");
		String date= text+" "+text2;
		System.out.println(date);
		
		
//		left: 20%;
		System.out.println(value);
		
		
		
		
	
	
	}

}
