package com.Programming;

import java.util.*;

public class Occurance {

	public static void main(String[] args) {

		// a=1, b=2 ... ... . .

		String str = "aabbbbccccceddddddd";

		char[] c = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char tempChar : c) {

			if (map.containsKey(tempChar)) {
				map.put(tempChar, map.get(tempChar) + 1);
			} else {
				map.put(tempChar, 1);
			}
		}
		System.out.println(map);
		
	}

}
