package com.ConstrctorConcept;

public class ConstructorSuper extends ConstractorConcept {
	/*
	 * in every constractor super keyword will comes in starting statement 
	 * super keyword we only use in constractor
	 * super keyword calls according to the input argument
	 * it execute the statement while creating the object for the Constractor
	 * 
	 * 
	 */
	
	
	public ConstructorSuper() {
		super(10,"name");
		System.out.println("super Keyword");
		
	}
	public ConstructorSuper(int age) {
		super();
		System.out.println("super Keyword");
		
	}
	

	public static void main(String[] args) {
		ConstructorSuper c=new ConstructorSuper();
		ConstructorSuper c1=new ConstructorSuper(10);

	}

}
