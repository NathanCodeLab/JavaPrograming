package com.seleniumPackage;

import java.io.File;

import org.openqa.selenium.By;

public class DownloadFile extends ReusableLibrary{
	
	
	public static void validatefile() throws InterruptedException {
		driver.findElement(By.id("j_idt93:j_idt95")).click();
		Thread.sleep(3000);
		File filelocation= new File("/Users/sabarinathan/Downloads");
		File[] listFiles = filelocation.listFiles();
		for (File file : listFiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println(file.getName()+" is downloaded");
				break;
			}
		}
		
		
		
	}
	
	

}
