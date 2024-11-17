package com.program.java.oops.part6;

import java.io.File;
import java.io.IOException;

public class FileHandlingProgram {

	public static void main(String[] args) {

		// An abstract representation of file and directory pathnames.

		File ob = new File("C:\\z - Disk - E\\Online classes\\jar\\new\\jarDetails.txt");

		try {

			if (ob.createNewFile()) {
				System.out.println("File " + ob.getName() + " is created successfully");
			} else {
				System.out.println("File is already exist in the directory");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
