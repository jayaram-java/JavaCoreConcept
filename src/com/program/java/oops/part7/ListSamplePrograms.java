package com.program.java.oops.part7;

import java.util.ArrayList;
import java.util.List;

public class ListSamplePrograms {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b[] = { 10, 20, 30, 40, 50 }; // define // Homogeneous
		
		int c[] = new int[5]; // declare
		
		c[0] = 1; // initialzation
		c[1] = 2;
		c[2] = 3;
		c[3] = 4;
		c[4] = 1000;
		
		// Array - to store multiple values of the same type

	}

	public void arrayExample() {

		int a = 10;

		int b[] = { 10, 20, 30, 40, 50 }; // define // Homogeneous

		int c[] = new int[5]; // declare

		c[0] = 1; // initialzation
		c[1] = 2;
		c[2] = 3;
		c[3] = 4;
		c[4] = 1000;

		String d[] = { "India", "America", "china", "UK" };

		// Array - to store multiple values of the same type

	}

	public void arraylistExample() {

		List ob = new ArrayList(); // heterogeneous

		ob.add("India");
		ob.add(100);
		ob.add('A');
		ob.add(null);

		System.out.println(ob);

	}

}
