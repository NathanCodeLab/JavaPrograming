package com.simple;

public class WrapperClass {

	public static void main(String[] args) {

		// It is same like datatypes and act like a class
		//It is useful for synchronization in multithreading
		// synchronization allows only one thread at a time
		// usually we will use in generic in collections and parse the value to corresponding datatypes
		
		
		//Wrapper class
		//1. Integer
		//2. Float
		//3. Double
		//4. 
		//5. Boolean
		//6. Byte
		//7. Short
		//8. Long
		
		//Examples
		
		String str="12345";
		String str1="Nathancodelab";
		
		//convert to integer
		
		int convertedToInt = Integer.parseInt(str);
		System.out.println(convertedToInt);
		
		
		//if you use the another format of conversion it will hits the NumberFormatException
		
		int convertedStringtoInt = Integer.parseInt(str1);
		System.out.println(convertedStringtoInt);
		//For generic pls refer the collection java documents.
		
		
		
		
		
	}

}
