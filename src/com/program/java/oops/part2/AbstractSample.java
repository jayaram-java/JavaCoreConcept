package com.program.java.oops.part2;

abstract class Ramu {

	void go() {
		System.out.println("go");
	}

	abstract void gone();
}

class Test extends Ramu {

	@Override
	void gone() {

		System.out.println("gone");
	}

}

public class AbstractSample {

	public static void main(String[] args) {

		Test ob = new Test();
		
		ob.go();
		ob.gone();
		
	}

}

// Abstraction - It is the mechanism of hiding the implementation details from the user & representing only the essential feature.

// Types : Abstract(80% abstraction)  & interface(fully abstraction 100%)

// abstract is the keyword

// we can use abstract keyword in front of the classes , method.

// The declared method should be abstract method

// Abstract class must be a super class

// can't create instance or object for abstract class