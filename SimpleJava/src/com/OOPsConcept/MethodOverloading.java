package com.OOPsConcept;

public class MethodOverloading {
	/*
	 * All method name's will same we can pass the input parameter only when we call
	 * the method we can get the argument it will not accept similar datatype it
	 * will accept different datatypes or change in order we can pass number of
	 * arguments
	 * 
	 */

	public void methodOverloading() {

	}

	public void methodOverloading(int a) { // we can pass all primitive datatypes

	}

	public void methodOverloading(int a, int b) {

	}

	public void methodOverloading(int a, String b) {

	}

	public void methodOverloading(String a, int b) {

	}

	public void methodOverloading(String a, double b, boolean c) {

	}

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.methodOverloading();
		m.methodOverloading(10);
		m.methodOverloading(10, 10);
		m.methodOverloading(10, "Nathan");
		m.methodOverloading("Nathan", 10);
		m.methodOverloading("Nathan", 10.0, true);

	}

}
