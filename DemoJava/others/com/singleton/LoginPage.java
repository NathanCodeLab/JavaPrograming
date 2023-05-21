package com.singleton;

public class LoginPage extends Singleton{

private void method() {
	System.out.println("dummy method");
	
	getInstance();
}	
	
	
	
	
	public static void main(String[] args) {
		
		LoginPage s=new LoginPage();
		LoginPage page=(LoginPage) s.getInstance();
		LoginPage s1=new LoginPage();
		page.method();
		
		

	}

}
