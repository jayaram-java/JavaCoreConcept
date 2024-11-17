package com.program.java.example;

public class PayPalPayment extends Payment {

	@Override
	void processPayment(double amount) {
		System.out.println("Processing PayPal payment of $" + amount);
	}

}
