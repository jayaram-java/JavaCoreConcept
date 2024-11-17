package com.program.java.example;

//Subclass (Derived Class) for Credit Card payment
public class CreditCardPayment extends Payment {

	@Override
	void processPayment(double amount) {
		System.out.println("Processing credit card payment of $" + amount);

	}

}
