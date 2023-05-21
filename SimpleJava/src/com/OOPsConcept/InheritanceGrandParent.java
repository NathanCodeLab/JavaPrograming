package com.OOPsConcept;

public class InheritanceGrandParent {
	
	// This method can use anywhere in project
	public int MethodGrandParentPublic() {
		int a =10;
		return a;

	}

	// This method can use only inside the class
	private int MethodGrandParentPrivate() {
		int a =20;
		return a;

	}

	// This method can use inside and outside of the package
	protected int MethodGrandParentProtected() {
		
		int a=30;
		return a;

	}

	// This method can use only inside the package
	int MethodGrandParentDefault() {
		int a=40;
		return a;
		

	}
	
	

}
