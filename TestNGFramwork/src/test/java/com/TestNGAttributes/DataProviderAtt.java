package com.TestNGAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAtt {
	
	
	String [][] data= {
			
			{"Admin","Password"},
			{"Admin1","Password1"},
			{"Admin2","Password2"},
			{"Admin3","Password3"}
			
	};
	
	
	@DataProvider(name="loginData")
	private String[][] dataProvider() {
		return data;
	}
	
	
	
	@Test(dataProvider = "loginData")
	private void loginCredentials(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}

}
