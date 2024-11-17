package com.program.java.example;

public class Main {

	public static void main(String[] args) {

		// Creating a Product object
		Product generalProduct = new Product("Generic Item", 10.99, 50);
		System.out.println("General Product Details:");
		generalProduct.displayDetails();
		System.out.println("Total Value: $" + generalProduct.calculateTotalValue());
		System.out.println();
	}

}
