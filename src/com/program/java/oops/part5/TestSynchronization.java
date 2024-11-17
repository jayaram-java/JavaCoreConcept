package com.program.java.oops.part5;

class Table {

 synchronized void printTable(int n) {

		for (int i = 1; i <= 5; i++) {

			System.out.println(n * i);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}

class A extends Thread {

	Table t;  // Table t = new Table();

	public A(Table t) {
		super();
		this.t = t;
	}

	public void run() {

		t.printTable(5);

	}
}

class B extends Thread {

	Table t;

	public B(Table t) {
		super();
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}

}

public class TestSynchronization {

	public static void main(String[] args) {
		
		Table obj = new Table();
		
		//int a = 10;
		
		
		A t1 = new A(obj);
		
		B t2 = new B(obj);
		
		t1.start();
		
		t2.start();
		

	}

}

// Synchronization is better option where we want to allow only one thread to access the shared resources.
