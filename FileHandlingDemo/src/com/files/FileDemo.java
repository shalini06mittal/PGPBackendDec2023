package com.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A{
	
}
class B{
	A a;
}
public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		// highly cohesiveness
		// file is an objwct that acts as a reference to the filenam sample.txt
		File file = new File("sample.txt");
		
		System.out.println(file.exists());
		
		file.createNewFile();
		System.out.println(file.exists());
		//file.renameTo(new File("trial.txt"));
		//file.setReadOnly();
		//System.out.println(file.delete());
//		FileWriter writer = new FileWriter(file);
//		writer.write("soemthing");
//		writer.close();
		
		File dir1 = new File("demo");
		System.out.println(dir1.mkdir());
		
		File f1 = new File("demo", "f1.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f1.length());
		System.out.println(f1.lastModified());
		
		File f2 = new File("demo", "f2.txt");
		System.out.println(f2.createNewFile());
		
		File f3 = new File("demo", "f3.txt");
		System.out.println(f3.createNewFile());
		
		for(String s:dir1.list())
			System.out.println(s);
		
		for(File f: dir1.listFiles())
		{
			System.out.println(f.getName());
			System.out.println(f.isFile()+" "+f.isDirectory());
			
		}
		
	}

}
