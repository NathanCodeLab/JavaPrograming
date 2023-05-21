package com.programming;

public class SwapNumbers {

	public static void main(String[] args) {

		//Swapping Two Numbers

		int a = 10;
		int b = 20;

		int temp;

		System.out.println("Before swapping : " + a + " " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping : " + a + " " + b);

	}

}
