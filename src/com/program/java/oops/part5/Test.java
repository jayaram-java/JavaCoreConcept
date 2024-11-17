package com.program.java.oops.part5;

public class Test extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("num = " + i);
			
			try {
				Thread.sleep(1000); // the currently executing thread to sleep for the specified number of milliseconds
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}

	}

	public static void main(String[] args) {

		Test ob = new Test();

		ob.start();
		
		try {
			ob.join();   // waits for a thread to die
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		for (int j = 0; j <= 5; j++) {

			System.out.println("From main thread " + j);

		}

	}

}
