package com.singleton;


public class Singleton {
	
	private static Singleton signle_instance=null;
	public static String str;
	
	public Singleton() {
		str="Hi i am singleton design";
	}
	
	public static Singleton getInstance() {
		if(signle_instance==null)
			signle_instance= new Singleton();		
		return signle_instance;
	}
	

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		
		String upperCase = a.str.toUpperCase();
		String upperCase1 = b.str.toUpperCase();
		String upperCase2 = c.str.toUpperCase();
		
		Singleton s=new Singleton();
		
		
		System.out.println(upperCase);
		System.out.println(upperCase1);
		System.out.println(upperCase2);
		
		
	}

}
