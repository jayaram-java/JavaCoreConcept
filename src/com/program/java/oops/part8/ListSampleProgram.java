package com.program.java.oops.part8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSampleProgram {

	public static void main(String[] args) {

		Vector<String> ob = new Vector<String>();

		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");

		System.out.println("Vector result = " + ob);

		// Vector is synchronized
		// Vector is slow as it is thread safe
		// Vector is default to doubling size of its array

	}

	public static void arrayListPrograms() {

		ArrayList ob = new ArrayList<>();

		ob.add(10);
		ob.add("Raja");
		ob.add(20.5);
		ob.add('Y');
		ob.add(null);
		ob.add("Raja");

		System.out.println(ob);

		// It allows hetrogeneous data type.
		// Arraylist internally uses a dynamic array to store the elements
		// null insertion is possible
		// It allows duplicate elements
		// insertion order

		ob.add(0, "Japan");

		System.out.println(ob);

	}

	public static void LinkedListProgram() {

		List<String> ob = new LinkedList<String>();

		ob.add("India"); // 0
		ob.add("America"); // 1
		ob.add("China"); // 2
		ob.add("England"); // 3

		System.out.println(ob);

		// LinkedList internally uses a doubly linked list to store the element.
		// null insertion is possible
		// It allows duplicate elements
		// insertion order
		// It allows hetrogeneous data type.

	}

}
