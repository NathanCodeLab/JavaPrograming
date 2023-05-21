package com.Programming;

public class Palindrome {

	public static void main(String[] args) {

		//palindrome
		// 121 121
		//1234321
		//10100101
		int num = 121;
		
		// reverase
		//reverser the number
		int reminder;
		int rev=0;
		int temp;
		temp=num;
		
		while(num>0) {
			reminder = num%10;
			rev = (rev*10)+reminder;
			num = num/10;
		}
		
		if (temp==rev) {
			System.out.println("It palindrome");
		} else {
			System.out.println("It not palindrome");

		}
			
			
		
		
		
		
	}

}
