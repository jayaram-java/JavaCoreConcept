package com.program.basic;

public class B {
	
	public void multiplication(int a,int b) {
		
		int result = a*b;
		
		System.out.println("Multiplication result = "+result);
		
	}

	public static void main(String[] args) {
	
		
		B ob = new B();
		
		ob.multiplication(5, 5);
		
		A ob1 = new A();
		
		ob1.addition(200, 300);

	}

}
