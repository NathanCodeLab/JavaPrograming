package com.InheritanceConcept;

import com.OOPsConcept.InhertanceParent;

public class InheritancePublicConcept {

	private int methodChild1() {
		InhertanceParent obj = new InhertanceParent();

		int a = obj.MethodGrandParentPublic();
		int b = obj.methodParentPublic();
		

		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		InheritancePublicConcept obj1 = new InheritancePublicConcept();
		int a = obj1.methodChild1();
		System.out.println("Sum of all return values : " + a);
	}

}
