package com.program.java.oops.part1;

public class A2 { // A2 is super class // Hierarchical

	void go() {
		System.out.println("Go - From A2 class");
	}

}

class B2 extends A2 { // B2 is sub class

	void good() {
		System.out.println("Good - From B2 class");
	}
}

class C2 extends A2 { // C2 is sub class

	void gone() {
		System.out.println("Gone - From C2 class");
	}
}