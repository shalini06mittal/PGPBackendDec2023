package com.files;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBinaryStream {

	public static void main(String[] args) throws IOException {
		// MessageDigest
		File file = new File("/Users/Shalini/Desktop/ksh.jpeg");
		FileInputStream inputStream = new  FileInputStream(file);
		System.out.println(file.length());
		
		long len = file.length();
		byte b[] = new byte[(int)len];
		
		// read the contents and store in byte []
		//int numofbytes = 
		inputStream.read(b);
		
		FileOutputStream fileOutputStream = new FileOutputStream("profile1.jpeg");
		fileOutputStream.write(b);
		fileOutputStream.close();
		
	}
}
