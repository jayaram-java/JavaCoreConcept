package com.program.java.oops.part1;

public class A1 { // single inheritance // A1 is super class

	public void addition(int a, int b) {

		System.out.println("Using inheritance");

		int result = a + b;

		System.out.println("Addition = " + result);

	}

}

class B1 extends A1 { // B1 is sub class  // A1 is super class

	public void multiplication(int a, int b) {

		int result = a * b;

		System.out.println("Multiplication result = " + result);

	}
}

class C1 extends B1 { // Multilevel inheritance  // c1 is sub class // b1 is super class

	public void subtration(int a, int b) {

		int result = a - b;

		System.out.println("Subtration result = " + result);

	}

}
