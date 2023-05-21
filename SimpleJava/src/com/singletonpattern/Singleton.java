package com.singletonpattern;

public class Singleton {

	/*
	 * singleton is a pattern its not a keyword or any other function 
	 * It is will create only one object at a class instance of the class at a time 
	 * If you try to create another object it will point to same object
	 * 
	 * 
	 * steps : 1. create private constructor 
	 * 			2. create static method and should return class object(lazy initialization)
	 * 
	 */

	private static Singleton single_instance = null;
	public String str;

	private Singleton() {
		str = "Hey i am singleton pattern";
	}

	public static Singleton getInstance() {

		if (single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}

	public static void main(String[] args) {

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		Singleton d = Singleton.getInstance();

		a.str = a.str.toUpperCase();

		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);

		d.str = d.str.toLowerCase();

		System.out.println(d.str);
		System.out.println(a.str);

	}

}
