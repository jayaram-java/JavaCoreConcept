package com.program.java.example;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public  Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

	public void displayDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Quantity: " + quantity);
	}

	public double calculateTotalValue() {
		return price * quantity;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
