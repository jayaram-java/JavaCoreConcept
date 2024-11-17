package com.program.java.oops.part1;

public class A3 {

	void go() {
		System.out.println("go - From A3");
	}
}

class B3 {

	void gone() {
		System.out.println("gone - From B3");
	}
}

class C3 extends A3,B3{
	
	void good() {
		System.out.println("good - From C3");
	}
	
}

// Ambiguous problem