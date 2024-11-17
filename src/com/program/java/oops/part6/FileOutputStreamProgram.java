package com.program.java.oops.part6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamProgram {

	public static void main(String[] args) {

		// To write data to a file destination

		File ob = new File("C:\\z - Disk - E\\Online classes\\jar\\new\\jarDetails.txt");

		String content = "Java is platform independent";

		byte b[] = content.getBytes();

		try {

			FileOutputStream ob1 = new FileOutputStream(ob);

			ob1.write(b);

			ob1.close();

			System.out.println("Data inserted.....");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
