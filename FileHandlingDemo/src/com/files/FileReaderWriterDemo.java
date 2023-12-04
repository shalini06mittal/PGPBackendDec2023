package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 2 types of streams
 * 1. byte-oriented => images/ audio/ video
 * InputStream/ OutputStream 
 * 2. character-oriented => textual
 * Reader / Writer
 */
public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		// write content
		
		/**
		 * open a files
		 * read/ write/ append
		 * save the contents
		 * close the file
		 */
		// relative path  to the root of the project
		// if files exists it overwrites else it creates the file
//		FileWriter writer = new FileWriter("test.txt", true);
//		writer.write("Welcome\n");
//		writer.write("See ya\n");
//		writer.write("Bye\n");
//		writer.close();
		
		FileReader reader = new FileReader("test.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		while(true) {
			String s = bufferedReader.readLine();
			if(s==null)
				break;
			System.out.println(s);
		}
//		int x = -1;
//		while((x=reader.read()) !=-1) {
//			System.out.print((char)x);
//		}
		reader.close();
		
		
		

	}

}
