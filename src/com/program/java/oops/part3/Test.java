package com.program.java.oops.part3;

public class Test { // Constructor overload | parameterized constructor

	public Test() {
		super();

		System.out.println("Default Constructor");
	}

	public Test(String name) {

		this();

		System.out.println("Parameter is String");

	}

	public Test(double d) {

		this("growth");

		System.out.println("Parameter is double");

	}

	public Test(int x) {

		this(2.5);

		System.out.println("Parameter is int");

	}

	public static void main(String[] args) {

		// Test ob = new Test();

		// Test ob1 = new Test("india");

		// Test ob2 = new Test(10.5);

		Test ob3 = new Test(100);

	}

}


// this() -> access the current class constructor
// this -> to access the global variable of the current class

// super() - to access the super class constructor
// super -> to access the methods of the super class





















