package com.simple;

public class ProjectSetup {

	// 1. Project
	// We can create many projects but each project represents separate contents.
	// always the project name start with UpperCase

	// 2. Package
	// We can create many package using Rightclick on src -> New -> package
	// always the package name start with LowerCase and proper way is start with
	// domain -> com.packageName
	// Without package you can't create the class and scripts

	// 3. Class
	// it is an Single entity to create functions and statement
	// always class name start with UpperCase.
	// class is a keyword
	// Access Specifier keyword className { } syntax for class

	// 4. Method or Function
	// block of code that, when called, performs specific actions mentioned in it
	// holds different statement inside the bracket
	// usually the method name should be in lowercase
	// Access Specifier ReturnType methodName { } syntax for method
	// void - doesnt return any values
	// you can give the any proper method name
	// it can be overloaded

	public void methodName() {

		// Write your statement here
	}

	public int methodName(int i) {
		return i; // overloaded and returns the value

	}

	// 5. Variable
	// Two types of variables Globle and Local Variable

	// Globle Variable
	// Declare inside the class and access anywhere inside the class

	int globleVariable = 12345; // declaring the class level variable

	// Local Variable
	// Declare inside the method and only that variable access inside the method

	public void methodname() {
		int globleVariable = 12345; // declaring the same reference name in method level variable

	}

	public static void main(String[] args) {

		// 6. main method
		// Every java program execution start from main method
		// it can be overloaded and static in nature
		// Access Specifier static keyword ReturnType main (String array[] arguments){ }
		// syntax for main method
		// main method can be return any values only when it is overloaded.
		
		main();      // overload main method
		int main = main(10);    // one argument method overloading returns values

		// 7. Object
		// Since java is object oriented programming language OOPS
		// method will be execute with the help of objects
		// without object creation we can not call the method name
		// ClassName referenceName = new keyword Classname(); syntax to create object
		
		ProjectSetup object = new ProjectSetup();		// object creation
		object.methodname();							// calling the method using object reference name
		object.methodName(10);							// calling the method and passing input parameters
		

	}
	public static void main() {
		
	}
	public static int main(int i) {
		return i;
		
	}
	

}
