package com.program.java.dsa;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = new int[10]; // array declare
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values ");

		for (int k = 0; k < 10; k++) {
			a[k] = sc.nextInt();
		}

		System.out.println("Elements of original array");

		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}

		// 30 40 50 120 10 20 70 80 110 150

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) { // 20 < 30
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println();

		System.out.println("Desending order");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		//150 120 110 80 70 50 40 30 20 10 

	}

}
