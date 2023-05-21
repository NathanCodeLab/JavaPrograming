package com.StaticAndNonStatic;

public class StaticConcept {
	
	// without any object calling the methods or variable
	// static is a keyword
	// if we use static - calling variable or method should also static
	// ex - main method is an static
	// separate memory allocation for static = parmanent generation or metaspace
	
	static int a =10;
	
	int b=10;
	
	public static void methodStatic() {
		System.out.println("static");
	}
	
	
	
	public static void main(String[] args) {
		StaticConcept s= new StaticConcept();
		System.out.println(s.b);
		System.out.println(a);
		s.methodStatic();
		methodStatic();
	}

}
