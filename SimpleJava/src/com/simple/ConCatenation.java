package com.simple;

public class ConCatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);   // this will add the two values result will be 30
		
		System.out.println(a+""+b); // this will concat the two values result will be 1020
		
		System.out.println(+a+b); // this will add the two values result will be 30
		
		//if we have string to concat
		
		String c="nathan";
		
		String d=c+a+b;
		String e=a+b+c;
		String f=a+c+b;
		String g=a+""+b+c;
		//		int g=a+b+c;   	you should not use this statement it gives you an error
		
		System.out.println(a+c); // this will concat the two values result will be 10nathan
		
		System.out.println(b+c); // this will concat the two values result will be 20nathan
		
		System.out.println(a+b+c); // this will add two numbers and concat the two values result will be 30nathan
		
		System.out.println(c+a+b); // this will concat the two values result will be nathan1020
		
		System.out.println(a+c+b); // this will concat the two values result will be 10nathan20
		
		System.out.println(d); // this will concat the three values result will be nathan1020
		
		System.out.println(e); // this will add two numbers and concat the two values result will be 30nathan

		System.out.println(f); // this will  concat the three values result will be 10nathan20
	
		System.out.println(g); // this will  concat the three values result will be 1020nathan
	}

}
