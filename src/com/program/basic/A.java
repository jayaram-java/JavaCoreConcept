package com.program.basic;

public class A {
	
	public void addition(int a , int b) {
		
		int result = a+b;
		
		System.out.println("Addition = "+result);
		
	}

	public static void main(String[] args) {
		
		A ob = new A();
		
		ob.addition(10, 20);

	}

}
