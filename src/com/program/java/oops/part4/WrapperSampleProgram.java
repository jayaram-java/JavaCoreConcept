package com.program.java.oops.part4;

public class WrapperSampleProgram {

	public static void main(String[] args) {
		
		
		int a = 20; // Primitive data type

		Integer j = Integer.valueOf(a); // object

		System.out.println("Autoboxing");

		System.out.println(j);
		
		System.out.println("-------------------------------------------------------------------------------------------------------");

		Integer ob = 30;
		
		int i = ob.intValue();
		
		System.out.println("Autounboxing");
		
		System.out.println(i);

	}

}

// Wrapper class - It has two types. 1. Autoboxing (Primitive to object) 2. AutoUnboxing(Object to primitive data type)
