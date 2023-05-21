package com.programming;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		String name = "sabari";
		String rev = "";

		char[] ch = name.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		System.out.println(rev);

		// Using StringBuffer to Reverse the string
		StringBuffer buff = new StringBuffer(name);
		StringBuffer reverse = buff.reverse();
		String string = reverse.toString();
		System.out.println(buff);

	}

}
