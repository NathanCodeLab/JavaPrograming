package com.simple;

public class TryCatchFinally {

	public static void main(String[] args) {

		
		String s="13433a";		
		
		try {
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(s);
		}
			
		
	}

}
