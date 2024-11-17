package com.program.java.oops.part4;

public class StringSamplePrograms {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		sb.append("java");
		sb.append(" programming language");

		System.out.println("Stringbuffer = " + sb);

		// Stringbuffer is mutable. Synchronized. Performance is low compare to
		// Stringbuilder

		StringBuilder ob = new StringBuilder();

		ob.append("Java");

		ob.append(" has multithreading");

		System.out.println("StringBuilder = " + ob);

		// Stringbuilder is mutable. non-synchronized. Performance is high compare to
		// Stringbuffer
	}

	public void memoryAllocation() {

		String ob1 = "HELLO"; // String pool

		String ob2 = "HELLO"; // String pool

		String ob3 = new String("HELLO"); // heap memory

		if (ob1 == ob2) {

			System.out.println("Same memory location");

		} else {

			System.out.println("Different memory location");
		}

		System.out.println("");

	}

	public void methodString() {

		char value = 'A';

		String name = "india";

		// String is immutable. Object state can't be changed.

		String ob = new String("java"); // Normal Object creation // heap memory

		String ob1 = "java"; // literal object creation // String constant pool

		String firstName = "Raja";

		String lastName = "Pandian";

		String username = firstName.concat(" ").concat(lastName);

		System.out.println(username);

		System.out.println(firstName.toUpperCase());

	}

}
