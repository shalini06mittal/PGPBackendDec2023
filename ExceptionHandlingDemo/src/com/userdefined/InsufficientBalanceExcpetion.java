package com.userdefined;

// unchecked exception
public class InsufficientBalanceExcpetion extends Exception {
	
	public InsufficientBalanceExcpetion(String message) {
		super(message);
	}
}
