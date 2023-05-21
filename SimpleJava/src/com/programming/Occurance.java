package com.programming;

import java.util.*;

public class Occurance {
	
	//Occurance of the given String
	
	/*
	 * Steps to find the occurance
	 * convert to toCharArray
	 * Using hashmap to count the values in key and value pair
	 * using foreach loop to get each character
	 * using if condition and containsKey to check count the character
	 * using put method to add the counts
	 */
	

	public static void main(String[] args) {

		String name = "sabarinathan";

		char[] charArray = name.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
