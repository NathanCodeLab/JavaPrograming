package com.packageName;

public class Looping {

	public static void main(String[] args) {

		int a =0;
		int b=1;
		int temp=0;
		
		
		//011235813.....
		
		System.out.print(a+" "+b);
		
		for(int i=1; i<10;i++) {
			temp=a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
			
		}
		
		
		
		
		
	}

}
