package com.simple;

import java.util.*;

public class ScannerInJava {

	/*
	 * Scanner is user to get the values from the console using next method to get
	 * the values for string we need to use the nextLine to get the values
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Int Value :");
		int intNumber = scan.nextInt();

		System.out.println("Enter Byte Value :");
		byte byteNumber = scan.nextByte();

		System.out.println("Enter Short Value :");
		short shortNumber = scan.nextShort();

		System.out.println("Enter Long Value :");
		long longNumber = scan.nextLong();

		System.out.println("Enter Float Value :");
		float floatDecimal = scan.nextFloat();

		System.out.println("Enter Double Value :");
		double doubleDecimal = scan.nextDouble();

		System.out.println("Enter Boolean Value :");
		boolean valid = scan.nextBoolean();

		System.out.println("Enter String Value :");
		String string = scan.next();

		System.out.println(intNumber);
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(longNumber);
		System.out.println(floatDecimal);
		System.out.println(doubleDecimal);
		System.out.println(valid);
		System.out.println(string);

	}

}
