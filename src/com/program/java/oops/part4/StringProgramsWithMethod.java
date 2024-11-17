package com.program.java.oops.part4;

public class StringProgramsWithMethod {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------------------- trim");

		String name = "  Raja ";
		System.out.println(name);

		String output = name.trim();
		System.out.println(output);

		System.out.println("--------------------------------------------------------------- split");

		String input = "Java is platform independent";

		String a[] = input.split(" ");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

		System.out.println("--------------------------------------------------------------- charAt");

		String firstName = "Raja";

		char result = firstName.charAt(2);

		System.out.println(result);

	}

}
