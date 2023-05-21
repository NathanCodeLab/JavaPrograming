package com.simple;

public class CallbyvalueRef {

	public static CallbyvalueRef var = null;

	private static void methodname(int a, int b) {
		System.out.println(a + " " + b);

	}

	private static void refMethod(CallbyvalueRef ref) {
		System.out.println(ref);
	}

	public static void main(String[] args) {

		int a = 10, b = 20;

		// call by value

		methodname(a, b); // call by value

		// call by reference

		refMethod(var);  

	}

}
