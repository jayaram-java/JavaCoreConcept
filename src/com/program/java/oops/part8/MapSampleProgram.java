package com.program.java.oops.part8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSampleProgram {

	public static void main(String[] args) {

		MapSampleProgram ob = new MapSampleProgram(); // static to non-static

		// ob.hashMapProgram();

		// ob.linkedHashMapPrograms();
		
		ob.treeMapPrograms();

	}

	public void treeMapPrograms() {

		TreeMap<Integer, String> ob1 = new TreeMap<>();

		ob1.put(2, "Raja");
		ob1.put(3, "Rahul");
		ob1.put(1, "Raja");
		ob1.put(5, "Virat");
		//ob1.put(null, "abc");
		ob1.put(4, "Rohit");

		System.out.println("TreeMap");

		for (Map.Entry<Integer, String> entry : ob1.entrySet()) {

			System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());

		}
		
		// It contains values based on key
		// It contains unique keys
		
		// It cannot have null key but can have multiple null values
		
		// It maintains ascending order

	}

	public void linkedHashMapPrograms() {

		LinkedHashMap<Integer, String> ob1 = new LinkedHashMap<>();

		ob1.put(2, "Raja");
		ob1.put(3, "Rahul");
		ob1.put(1, "Raja");
		ob1.put(5, "Virat");
		ob1.put(null, "abc");
		ob1.put(4, "Rohit");

		// ob1.put(null, null);

		System.out.println("LinkedHashMap");

		for (Map.Entry<Integer, String> entry : ob1.entrySet()) {

			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());

		}

		// It contains values based on key
		// It contains unique keys
		// It may have one null key & multiple null values

		// It maintains insertion order

	}

	public void hashMapProgram() {

		HashMap<Integer, String> ob1 = new HashMap<>();

		ob1.put(1, "Raja");
		ob1.put(2, "Raja");
		ob1.put(3, "Rahul");
		ob1.put(4, "Rohit");
		ob1.put(5, "Virat");
		ob1.put(null, "abc");
		// ob1.put(null, null);

		System.out.println("Hashmap");

		for (Map.Entry<Integer, String> entry : ob1.entrySet()) {

			System.out.println("key : " + entry.getKey() + " Value : " + entry.getValue());

		}

		// It contains values based on key
		// It contains unique keys
		// It may have one null key & multiple null values

	}

}
