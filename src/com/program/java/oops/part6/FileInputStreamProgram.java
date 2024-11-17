package com.program.java.oops.part6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamProgram {

	public static void main(String[] args) {

		// To read data from a source

		File ob = new File("C:\\z - Disk - E\\Online classes\\jar\\new\\jarDetails.txt");

		try {

			FileInputStream ob1 = new FileInputStream(ob);

			int i = 0;

			while ((i = ob1.read()) != 1) {
				System.out.print((char) i);
			}

			ob1.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
