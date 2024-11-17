package com.program.java.oops.part1;


class B4{ // super class // overriding | run time polymorphism
	
	protected void go(int a) {
		
		System.out.println("go - super class");
		System.out.println(" value a = "+a);
		
	}
	
}

public class C4 extends B4 { // c4 is sub class
	
	public void go(int a) {
		super.go(a);
		System.out.println("go - subclass");
	}

	public static void main(String[] args) {
		
		C4 ob = new C4();
		
		ob.go(10);

	}

}


// It happens in different class
// It must use extends keyword
// method name must be same
// parameter must be same
// Access specifier same or wider
// static method can't be override because it is a runtime polymorphism
// private , final method can't override
// business logic can be different
// return type & return statement must same
// we can use super keyword, It is used to access immediate super class members
