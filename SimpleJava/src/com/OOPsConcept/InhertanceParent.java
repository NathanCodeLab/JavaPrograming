package com.OOPsConcept;

public class InhertanceParent extends InheritanceGrandParent {

	// This method can use anywhere in project
	public int methodParentPublic() {
		int a=50;
		return a;

	}
	// This method can use only inside the class
	private int methodParentPrivate() {
		int a=60;
		return a;

	}
	// This method can use inside and outside of the package
	protected int methodParentProtected() {
		int a=70;
		return a;

	}
	// This method can use only inside the package
	int methodParentDefault() {
		int a=80;
		return a;

	}
	
	
}
