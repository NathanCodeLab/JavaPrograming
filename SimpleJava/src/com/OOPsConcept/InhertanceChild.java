package com.OOPsConcept;

public class InhertanceChild extends InhertanceParent {
	
	
	private int methodChild() {
		int a= MethodGrandParentPublic();
		int b= MethodGrandParentProtected();
		int c= MethodGrandParentDefault();
		int d= methodParentPublic();
		int e= methodParentProtected();
		int f= methodParentDefault();
		int g=a+b+c+d+e+f;
		return g;
	}
	

	public static void main(String[] args) {
		InhertanceChild obj= new InhertanceChild();
		
		int a=obj.methodChild();
		
		System.out.println("Sum of all return values : "+a);
		
	}

}
