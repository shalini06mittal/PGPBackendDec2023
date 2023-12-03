package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		String s = "Welcome";
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a pos");
			int pos = sc.nextInt(); //7
			System.out.println("Enter a value to divide with");
			int value = sc.nextInt(); //4

			int n = arr[pos]; //arr[7] = 8
			System.out.println(n/value); // 8/4 = 2
			System.out.println(s.charAt(pos)); //
			System.out.println(Integer.valueOf("10s") + 20);
			
		}
		// pipe operator | chains all the exceptions
		catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println("Out of range");
		}catch(ArithmeticException e) {
			System.out.println("denominator cannot be 0");
		}catch(InputMismatchException e) {
			System.out.println("Provide integer values only");
		}catch(RuntimeException e) // generalized class / super 
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Printing squares....");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] * arr[i]);
		}
	}

}
