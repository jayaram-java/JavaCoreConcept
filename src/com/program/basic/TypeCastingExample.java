package com.program.basic;

public class TypeCastingExample {

	public static void main(String[] args) {
		
		int a = 65;
		
		char c = (char)a;
		
		System.out.println(c);

	}
	
	public void widening() {

		// Implicit - widening

		// byte -> short(2) -> int(4) -> long(4) -> float(4) -> double(8)

		int x = 7;
		long y = x;
		float z = y;
		double z1 = z;

		System.out.println("Before conversion, int value = " + x);

		System.out.println("After conversion, long value = " + y);

		System.out.println("After conversion, float value = " + z);

		System.out.println("After conversion, double value = " + z1);

	}
	
	
	public void narrowing() {
		System.out.println("Typecast - Narrowing");

		double d = 166.66;

		long l = (long) d;

		System.out.println("Before conversion, double value " + d);

		System.out.println("After conversion, long value " + l);
	}

}

//notes :

//TypeCasting 

//It is the process of converting one data type to another.

// Implicit - widening

// byte -> short(2) -> int(4) -> long(4) -> float(4) -> double(8) 

// Explicit - narrowing 

// double(8) -> float(4) -> long(4) -> int(4) -> short(2) -> byte
