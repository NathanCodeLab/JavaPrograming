package com.seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class UploadFile extends ReusableLibrary {
	
	public static void validateUpload() throws InterruptedException, AWTException{
		
		driver.findElement(By.id("j_idt88:j_idt89_label")).click();
		Thread.sleep(2000);
		
		StringSelection select= new StringSelection("/Users/sabarinathan/Downloads/TestLeaf Logo.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot robot=new Robot();
		for(int i=0;i<4;i++) {
			
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
	Thread.sleep(4000);	
		
		
		
	}

}
