package com.program.java.oops.part5;

public class ExceptionHandlingPrograms { // unchecked exception

	public static void main(String[] args) {

		System.out.println("start");

		try {

			int a[] = new int[5];

			a[4] = 10 / 0;

			System.out.println(a[4]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception occurred");
		} catch (ArithmeticException e) {
			System.out.println("Arithmethic exception occurred");
		}

		System.out.println("end");

	}

}

// Exception - Exception is an event that occurs during the execution of a program & disrupts the normal flow of the program's instruction

// Exception handling with try-catch block

// try block - monitoring the error

// catch block - throw the exeception