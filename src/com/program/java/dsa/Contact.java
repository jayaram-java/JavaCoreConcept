package com.program.java.dsa;

public class Contact {

	String name;
	String phoneNumber;

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
