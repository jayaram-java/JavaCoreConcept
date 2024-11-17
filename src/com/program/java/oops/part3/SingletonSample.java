package com.program.java.oops.part3;

public class SingletonSample { // singleton pattern

	private static SingletonSample singletonInstance; // declare

	private static int num; // declare

	private SingletonSample() {
		super();
		System.out.println("Constructor called");
	}

	public double go() {

		System.out.println("It has double return type");
		
		return 2.5;
	}

	public static SingletonSample getInstance() {

		if (singletonInstance == null) {

			singletonInstance = new SingletonSample();
		}

		return singletonInstance;
	}

	public static void main(String[] args) {
		

		/*	SingleTonSample ob = new SingleTonSample();

			SingleTonSample ob1 = new SingleTonSample();

			if (ob == ob1) {
				System.out.println("Both objects are same");
			} else {
				System.out.println("Both objects are not same");
			} */

		/*SingletonSample ob = SingletonSample.getInstance();

		double result =  ob.go();
		
		System.out.println(result);*/
		
		SingletonSample ob =	SingletonSample.getInstance();
		
		SingletonSample ob1 =	SingletonSample.getInstance();
		
		if (ob == ob1) {
			System.out.println("Both objects are same");
		} else {
			System.out.println("Both objects are not same");
		} 

	}

}
