package com.StaticAndNonStatic;

public class NonStaticConcept extends StaticConcept{
	
	private static void method() {
		methodStatic();
		
	}
	
	public static void main(String[] args) {
		NonStaticConcept n= new NonStaticConcept();
		n.method();
		method();
		
				
	}
	

}
