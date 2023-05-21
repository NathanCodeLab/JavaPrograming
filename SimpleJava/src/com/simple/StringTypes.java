package com.simple;

public class StringTypes {
	public static void main(String[] args) {

		/*
		 * 
		 * It is a Class It is literal It is immutable can do pooling method to change
		 * the functions
		 * 
		 */

		// 0123456789....................
		String s = "Hello I am Immutable in nature";

		// To find a char at index position
		char charAt = s.charAt(6);
		System.out.println(charAt);

		// To return a length of the string
		int length = s.length();
		System.out.println(length);

		// To find the index of the char
		int indexOf = s.indexOf('i');
		System.out.println(indexOf);

		// To find the index of the String
		int indexOf2 = s.indexOf("am");
		System.out.println(indexOf2);

		// To find the index of char and setting the starting index
		int indexOf3 = s.indexOf('m', 10);
		System.out.println(indexOf3);

		// To find the index of string and setting the starting index
		int indexOf4 = s.indexOf("in", 10);
		System.out.println(indexOf4);

		// To toLowercase the string
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		// To toUppercase the string
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		// To trim the string
		String trim = s.trim();
		System.out.println(trim);

		// To replace the current character
		String replace = s.replace('I', 'T');
		System.out.println(replace);

		// To replace the current particular string
		String replace2 = s.replace("Hello", "Hi");
		System.out.println(replace2);

		// To replace all the words in the string you can use the replaceAll
		String replaceAll = s.replaceAll(s, "Am");
		System.out.println(replaceAll);

		// To split the string \\s-white space
		String[] split = s.split("\\s");

		for (String string : split) {
			System.out.println(string);
		}
		// To join the string
//		s.join(replaceAll, split)
		System.out.println();

		// To concat two strings
		String concat = s.concat(" Yes");
		System.out.println(concat);

		// To validate two strings we can use equals
		boolean equals = s.equals("HI");
		System.out.println(equals);

		// To validate two strings without case sence
		boolean equalsIgnoreCase = s.equalsIgnoreCase("hi");
		System.out.println(equalsIgnoreCase);

		// To check contains in the string
		boolean contains = s.contains("am");
		System.out.println(contains);

		// To check the string is empty or not
		boolean empty = s.isEmpty();
		System.out.println(empty);

		// To change datatypes to string
		String string = s.toString();
		System.out.println(string);

		// To split all the char in the string
		char[] charArray = s.toCharArray();
		System.out.println(charArray[3]);

		// It returns the substring of strings EX: 2 char - omit the two char
		String substring = s.substring(20);
		System.out.println(substring);

		// To get particular index letters
		String substring2 = s.substring(6, 16);
		System.out.println(substring2);

	}

}
