package com.InheritanceConcept;

public class Child2 extends Parent {

	private void method() {

		methoddefault();
		methodParentdefault();
		methodprotected();
		methodParentprotected();
		methodpublic();
		methodParentpublic();
		
		
		
	}
	

	public static void main(String[] args) {

	Child2 obj= new Child2();
	
	obj.method();
		
		
	}
}
