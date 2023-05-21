package com.Programming;

public class ReverseString {

	public static void main(String[] args) {

			String name ="sabari";//6 543210
			String rev="";
			//1.string buffer
			
			StringBuffer buff=new StringBuffer(name);
			StringBuffer reverse = buff.reverse();
			String string = reverse.toString();
			System.out.println(string);
			
			
			//2.looper
			
			char[] c = name.toCharArray();
			
			for(int i=c.length-1;i>=0;i--) {
				rev+=c[i];
			}
			System.out.println(rev);
		
	}

}
