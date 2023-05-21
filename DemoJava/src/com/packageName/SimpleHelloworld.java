package com.packageName;

public class SimpleHelloworld {

	int a = 10;
	

	public void method() {
		int a = 15;
		System.out.println(a+this.a);

	}
	
	
	
	
	
	// two type
	// Globle variable
	// local variable

	public static void main(String[] args) {
		SimpleHelloworld obj=new SimpleHelloworld();
		obj.method();
		System.out.println(obj.a);
		
	
		
	}

}
