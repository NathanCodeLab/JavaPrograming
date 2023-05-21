package com.ConstrctorConcept;

public class ConstractorConcept {

	int age = 27;
	String name = "nathan";

	/*
	 * Constractor and class name should same it does't return any values we can
	 * overload constructor argument should not be same for overloading it should
	 * different in order when creating object constrator will call and pass the
	 * input parameters we can use this and super keyword to call the variables and
	 * methods
	 * 
	 */

	public ConstractorConcept() {
		System.out.println("Default constrator");

	}

	public ConstractorConcept(int age, String name) {
		this.name = name;
		this.age = age;
		System.out.println(this.age);
		System.out.println(this.name);

	}

	public ConstractorConcept(String age, int name) {
		this.age = name;
		this.name = age;
		System.out.println(this.age);
		System.out.println(this.name);

	}

}
