package com.Programming;

public class ReverseNum {

	public static void main(String[] args) {
//
//		
//		int num=123455;
//		//554321
//		int reminder;
//		int rev=0;
//		
//		while(num!=0) {
//			reminder =num%10;
//			rev=rev*10+reminder;
//			num=num/10;
//		}
//		
//		System.out.println(rev);
//		
//		
//		
//		
//		
		
		
		int num=12345; // 12.3.4.5 - 5 // 1234   // 123
		
		int reminder;
		int rev=0;   // 5432
		
		while(num>0) {
			reminder = num%10;						// 2
			rev=(rev*10)+reminder;   // 5*10 5430+2
			num = num/10;
		}
		
		System.out.println(rev);
		
		
		
		
		
	}

}
