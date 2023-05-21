package com.InheritanceConcept;

import com.OOPsConcept.InhertanceParent;

public class InheritanceOtherPackageConcept extends InhertanceParent {

	private int methodChild() {
		int a = MethodGrandParentPublic();
		int b = MethodGrandParentProtected();
		int c = methodParentPublic();
		int d = methodParentProtected();

		int e = a + b + c + d;
		return e;
	}

	public static void main(String[] args) {
		InheritanceOtherPackageConcept obj = new InheritanceOtherPackageConcept();
		int a = obj.methodChild();
		System.out.println("Sum of all return values : "+a);
	}

}
