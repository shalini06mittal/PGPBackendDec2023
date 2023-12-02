package com.lambda;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StorageDemo {

	public static void main(String[] args) {
		// (paramaters) -> {} 
		Storage ob = new Storage() {
			
			@Override
			public void storeInFile(String data, String filename) {
				// TODO Auto-generated method stub
				
			}
		}; 
		
		Storage obj = (data, filename) -> System.out.print("lambda used");
		
		obj.storeInFile("abc", "abc.txt");

		Storage ob1  = ( text,  filename) -> {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write(text);
                System.out.println("Text successfully stored in the file: " + filename);
            } catch (IOException e) {
                System.err.println("Error storing text in the file: " + e.getMessage());
            }
		};
		ob1.storeInFile("abc", "abc.txt");
	}

}
