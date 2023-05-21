package com.seleniumFileHandling;

import java.io.*;

public class ReadandWright {

	public static void main(String[] args) {

		File inFile= new File("/Users/sabarinathan/Downloads/sample.pdf");
		File opFile= new File("/Users/sabarinathan/Downloads/sample-copy.pdf");
		
		FileInputStream input=null;
		FileOutputStream output=null;
		
		
		try {
			input = new FileInputStream(inFile);
			output = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(input.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i=0;
		try {
			while((i=input.read())!=-1) {
				output.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(input!=null){
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(output!=null){
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
