package com.Inhertancepublic;

import com.InheritanceConcept.Child2;
import com.InheritanceConcept.Parent;

public class Inheritancepublic extends Parent {
	private void method() {

		methodprotected();
		methodParentprotected();
		methodpublic();
		methodParentpublic();
		
		
		
	}
	

	public static void main(String[] args) {

		Inheritancepublic obj= new Inheritancepublic();
	
	obj.method();
		
		
	}

}
