package com.exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Exception handling
 * try, catch, finally, throw, throws
 * @author Shalini
 *
 *1. the block that may throw an exception put within try block
 *2. there should always be a catch or finally or both followed by try
 */
public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		Calculator ob = new Calculator();
		
		InputStreamReader reader = new InputStreamReader(System.in);
	
			reader.read();
		
		Integer.parseInt("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n1 = sc.nextInt();
		System.out.println("Enter a no");
		int n2 = sc.nextInt();
		
		System.out.println("Add "+ob.add(n1, n2));
		try {
			System.out.println("Div "+ob.div(n1, n2));
		}catch(ArithmeticException e) {
			System.out.println("n2 cannot be 0");
			e.printStackTrace();
		}
		System.out.println("Sub"+ob.sub(n1, n2));
		System.out.println("Mul "+ob.mul(n1, n2));
		

	}

}
