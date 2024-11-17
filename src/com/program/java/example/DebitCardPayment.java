package com.program.java.example;

public class DebitCardPayment extends Payment {

	@Override
	void processPayment(double amount) {
		System.out.println("Processing debit card payment of $" + amount);
	}

}
