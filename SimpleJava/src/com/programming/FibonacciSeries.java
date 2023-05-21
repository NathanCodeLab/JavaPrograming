package com.programming;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 7 12 19 . . . . . .
		// Factorial of the number

		int num1 = 0;
		int num2 = 1;
		int temp;

		System.out.print(num1 + " " + num2);
		for (int i = 1; i < 10; i++) {
			temp = num1 + num2;
			System.out.print(" "+temp);
			num1 = num2;
			num2 = temp;
		}
		
	}

}
