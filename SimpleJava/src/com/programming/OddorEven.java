package com.programming;

import java.util.ArrayList;
import java.util.Arrays;

public class OddorEven {

	public static void main(String[] args) {

		// odd = 1 3 5 7 9 ......
		// even = 2 4 6 8 10 ......

		int num = 15;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even number");
			} else {
				System.out.println(i + " is Odd number");

			}
		}
		//using Arraylist to find the odd even numbers
		
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		number.removeIf(odd -> odd % 2 == 0);
		System.out.println("Odd numbers are : " + number);
		ArrayList<Integer> number1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		number1.removeIf(even -> even % 2 == 1);
		System.out.println("Even numbers are : " + number1);
	}

}
