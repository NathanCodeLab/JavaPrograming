package com.OOPsConcept;

public class MethodOverridingChild extends MethodOverridingParent {
	/*
	 * we can override the method only in child class
	 * method name should be same in both classes 
	 * types
	 * 1.Static Polymorphism or Compile time Polymorphism
	 * 2.Dynamic or Run time polymorphism
	 * 
	 */

	public static void main(String[] args) {
		
		MethodOverridingChild a = new MethodOverridingChild(); // static polymorphism // compile time polymo

		a.startButton();
		a.stopButton();
		a.refule();
		a.engine();
		a.seatVent();

		MethodOverridingGrandParent b = new MethodOverridingGrandParent();
		b.startButton();
		b.stopButton();
		b.refule();
		b.engine();
		b.seat();

		MethodOverridingGrandParent v = new MethodOverridingChild(); // dynamic polymor// run time

		v.startButton();
		v.stopButton();
		v.refule();
		v.engine();
		v.seat();

	}

}
