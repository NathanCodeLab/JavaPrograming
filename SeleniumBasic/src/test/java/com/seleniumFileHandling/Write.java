package com.seleniumFileHandling;

import java.io.*;
import java.util.Iterator;

public class Write {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/sabarinathan/Downloads/sample.txt");
		FileOutputStream output=null;
		
		output =  new FileOutputStream(file);
		String s = "This in write line.";
		char[] c = s.toCharArray();
		for (char ch : c) {
			output.write(ch);
		}
		output.close();
		
	}

}
