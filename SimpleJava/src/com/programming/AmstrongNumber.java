package com.programming;

public class AmstrongNumber {

	public static void main(String[] args) {

		// multiple by each number and add all the value. that value will be equal to
		// original number
		// 12 = 1*1*1 + 2*2*2 = 9 -> 12!=9
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+18 = 153 // It is amstronge number
		// 407 = 4*4*4 + 0 + 7*7*7 = 407 // It is amstronge number

		int num = 153;
		int reminder;
		int cube = 0;
		int temp;

		temp = num;

		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			cube = cube + (reminder * reminder * reminder);
		}

		if (temp == cube) {
			System.out.println("It is Amstrong Number");
		} else {
			System.out.println("It is Not a Amstrong Number");
		}
	}

}
