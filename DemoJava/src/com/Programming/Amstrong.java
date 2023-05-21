package com.Programming;

public class Amstrong {

	public static void main(String[] args) {

		// 12 = 1*1*1 + 2*2*2 =1+8 = 9 // It is not a amstrong number
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 = 153
		//407 = 407
		
		int num=407;
		int reminder;
		int cube=0;
		
		int temp;
		temp=num;
		
		
		while(num>0) {
			reminder = num%10;
			cube= cube + (reminder*reminder*reminder);
			num=num/10;
		}
		System.out.println(cube);
		
		if(temp==cube) {
			System.out.println(cube +" It is amstrong");
		}else
			System.out.println("It not is amstrong");
			
		
	}

}
