package com.exception;

/**
 * finally is a block that is exwcuted irrespectibe if the try block
 * throws an exception or not
 * It is used to release or close the resources or provide any clean up code
 * @author Shalini
 *
 */
public class FinallyDemo {

	public static void main(String[] args) {
		
		System.out.println("main starts");
		try {
			System.out.println(Integer.valueOf("10s")+20);
		}
		catch(NumberFormatException e) {
			System.out.println("error");
		}
		finally {
			System.out.println("finaly block");
		}

		System.out.println("main ends");
	}

}
