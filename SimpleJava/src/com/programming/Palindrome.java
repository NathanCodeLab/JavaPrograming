package com.programming;

public class Palindrome {

	public static void main(String[] args) {

		// 11 121 2332 2345432 ....
		// How to check we need to reverse the number and if equals to original value it
		// is palindrome

		int num = 121;
		int reminder = 0;
		int sum = 0;

		int temp;
		temp = num;
		while (num > 0) {
			reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
