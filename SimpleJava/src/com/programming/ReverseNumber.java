package com.programming;

public class ReverseNumber {

	public static void main(String[] args) {

		//To reverse the number using loop
		
		int num=1234567;
		
		
		
		int rev=0;
		
		while(num!=0) {
			int reminder =num%10;
			rev=rev*10+reminder;
			num=num/10;
		}
		
		System.out.println(rev);
		
		// To Reverse the number using stringbuffer
//		
//				String number=
//		StringBuffer buff = new StringBuffer();
//			StringBuffer reverse = buff.reverse();
//			System.out.println(reverse.toString());
		
	}

}
