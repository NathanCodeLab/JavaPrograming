package com.simple;

public class IfelseNestedif {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		int c=20;
		
		if (a>5) {
			System.out.println(" A is greater");
		}
		
		if (a>b) {
			System.out.println(" A is greater");
		}
		else {
			System.out.println(" B is greater");
		}
		
		// To compare three number how we do that - using nested if
		
		if (a>b && a>c) {
			System.out.println(" A is greater");
		}
		else if(b>c){
			System.out.println(" B is greater");
		}
		else {
			System.out.println(" C is greater");
		}
		
		

	}

}
