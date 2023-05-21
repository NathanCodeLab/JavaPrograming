package com.packageName;

public class IFelseNest {

	public static void main(String[] args) {

		
		int a=40;
		int b=30;
		int c=20;
		int d=10;
		int e=10;
		
		if(a>b) {
			
			System.out.println("is equal");
			
		}
		
		if(a<=b) {
			System.out.println("A is smaller");
		}
		else {
			System.out.println("A not a smaller");
			
		}
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println("A is greater");
			
		}else if(b>c) {
			System.out.println("B is greater");
			
		}else if(c>a) {
			
		}
		
		
		else {
			System.out.println("c is greater");
			
		}
		
		
		
		
		
		
	}

}
