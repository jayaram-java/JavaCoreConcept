package com.program.java.oops.part8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSamplePrograms {

	public static void main(String[] args) {

		// hashSetPrograms();

		// linkedHashSetPrograms();

		treeSetPrograms();

	}

	public static void treeSetPrograms() {

		TreeSet<String> ob = new TreeSet<>();

		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");
		ob.add("India");
		ob.add("India");
		// ob.add(null);

		System.out.println("TreeSet = " + ob);

		// It maintains default natural sorting order(ascending order)
		// It doesn't allow null element
		// Tree set internally uses treemap to store its elements

	}

	public static void linkedHashSetPrograms() {

		LinkedHashSet<String> ob = new LinkedHashSet<>();

		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");
		ob.add("India");
		ob.add("India");
		ob.add(null);

		System.out.println("LinkedHashSet = " + ob);

		// It maintains insertion order of elements
		// LinkedHashSet internally uses linkedHashmap to store its elements
		// It contains unique elements only. Don't allow duplicate element
		// It allows maximum one null elements.

	}

	public static void hashSetPrograms() {

		HashSet<String> ob = new HashSet<>();

		ob.add("India");
		ob.add("America");
		ob.add("China");
		ob.add("England");
		ob.add("India");
		ob.add("India");
		ob.add(null);

		System.out.println("HashSet = " + ob);

		// It has shuffled order
		// It contains unique elements only. Don't allow duplicate element
		// It allows maximum one null elements.
		// Hashset internally uses hashmap to store its elements
	}

}
