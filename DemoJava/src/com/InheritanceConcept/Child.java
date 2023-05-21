package com.InheritanceConcept;

public class Child extends Parent {
	
	private void method() {

		methoddefault();
		methodParentdefault();
		methodprotected();
		methodParentprotected();
		methodpublic();
		methodParentpublic();
		
		
		
	}
	

	public static void main(String[] args) {

	Child obj= new Child();
	
	obj.method();
		
		
	}

}
