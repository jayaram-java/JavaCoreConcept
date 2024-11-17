package com.program.java.oops.part8;

import java.util.HashMap;

class Key {

	String key;

	public Key(String key) {
		super();
		this.key = key;

		System.out.println("key" + key);
	}

	@Override
	public int hashCode() {

		System.out.println("Hashcode = " + (int) key.charAt(0));

		return (int) key.charAt(0);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("Equals = " + ((Key) obj).key);

		return key.equals(((Key) obj).key);
	}

}

public class HashMapInternal {

	public static void main(String[] args) {

		HashMap<Key, Integer> map = new HashMap<>();

		map.put(new Key("India"), 1);

		map.put(new Key("Canada"), 2);

		System.out.println((Integer) map.get(new Key("Canada")));

	}

}
