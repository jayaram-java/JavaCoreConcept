package com.program.java.example;

public class PaymentProcessor {
	
	 public static void main(String[] args) {
	        Payment creditCardPayment = new CreditCardPayment();
	        Payment debitCardPayment = new DebitCardPayment();
	        Payment payPalPayment = new PayPalPayment();

	        // Process each payment
	        processPayment(creditCardPayment, 100.0);
	        processPayment(debitCardPayment, 150.0);
	        processPayment(payPalPayment, 200.0);
	    }
	 
	 // Method to process payment using polymorphism
	    public static void processPayment(Payment payment, double amount) {
	        payment.processPayment(amount);

	    }

}
