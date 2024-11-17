package com.program.java.oops.part1;

public class A4 { // overloading | compile time polymorphism

	public void go(int a) {

		System.out.println("It has one param - int " + a);
	}

	protected static int go(int a, int b) {

		int result = a + b;
		
		int result1 = a * b;

		System.out.println("It has two param - a(int) = " + a + "& b(int) = " + b);

		System.out.println("Result = " + result);

		return result;
	}

	private char go(int a, float b) {

		System.out.println("It has two param - a(int) = " + a + "& b(float) = " + b);

		return 'A';
	}

	public static void main(String[] args) {

		A4 ob = new A4();

		ob.go(30);

		ob.go(20, 10.5f);

		A4.go(20, 40);

	}

}

// It happends in same class
// Method name must be same
// Parameter must be different
// Access specifier can be different
// static method can be overload
// return type can be different
// final , private can be overload
// business logic can be different
