package com.seleniumFileHandling;

import java.io.*;

public class Read {

	public static void main(String[] args) {
		
		File file = new File("/Users/sabarinathan/Downloads/sample3.txt");
		
		try {
			FileInputStream input= new FileInputStream(file);
//			BufferedReader bf= new BufferedReader(new FileReader(file));
			
			int i =0;
			try {
				while((i=input.read())!=-1) {
					System.out.print((char)i);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
