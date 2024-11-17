package com.program.java.oops.part3;

public class ConstructorSample {
	
	public ConstructorSample() {
		super();
		
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		
		ConstructorSample ob = new ConstructorSample();


	}

}


// Constructor name is same as class name. It has no return type

// Constructor called automatically when creates the object

// Constructor types : 1. Default constructor 2. Parameterized constructor 3. No-args Constructor

// Every class has one super class is Object