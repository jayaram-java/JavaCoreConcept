package com.program.java.oops.part8;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPrograms {

	public static void main(String[] args) {

		List<String> ob = new LinkedList<String>();

		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");

		System.out.println(ob);

		ListIterator<String> iterator = ob.listIterator(ob.size());

		System.out.println("reverse order");

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}

}
