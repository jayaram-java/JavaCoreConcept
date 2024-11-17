package com.program.java.oops.part1;

class Dog {

	public void act() {
		System.out.println("run ");
		eat();
	}

	public void eat() {

		System.out.println("eat");
	}

}

class UnderDog extends Dog {

	public void act() {
		super.act();
		System.out.println("sleep ");

	}

	public void eat() {
		super.eat();
		System.out.println("bark ");
	}
}

public class OverrideExample01 {

	public static void main(String[] args) {

		UnderDog ob = new UnderDog();

		ob.act();

	}

}
