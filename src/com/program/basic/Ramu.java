package com.program.basic;

public class Ramu {

	public static int a = 10; // globle

	public static void go() {

		int b = 50; // define
		int c; // declare
		c = 30; // initialize

	}

	public static int add() {

		return 10;
	}

	public boolean isEligible() {

		System.out.println("This is non static method");

		return true;
	}

	public static void main(String arg[]) {

		int result = add();

		System.out.println(result);

		Ramu ob = new Ramu();

		boolean result2 = ob.isEligible();

		System.out.println(result2);

	}

}
