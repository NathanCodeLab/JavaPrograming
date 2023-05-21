package com.Programming;

public class SwappingString {

	public static void main(String[] args) {

		String a = "suresh", b = "sabari";
		String temp;

		System.out.println("Before Swapping : " + a + " " + b);

		// b=10 a=20
		temp = a; // 10
		a = b; // 20
		b = temp; // 20

		System.out.println("After Swapping : " + a + " " + b);

	}

}
