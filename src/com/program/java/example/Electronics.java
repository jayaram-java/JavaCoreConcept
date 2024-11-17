package com.program.java.example;

public class Electronics extends Product {

	private int warrantyPeriod; // in months

	public Electronics(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Warranty Period: " + warrantyPeriod + " months");
	}

	// Getters and Setters
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

}
