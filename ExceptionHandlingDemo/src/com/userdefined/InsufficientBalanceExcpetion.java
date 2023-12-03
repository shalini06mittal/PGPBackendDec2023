package com.userdefined;

// unchecked exception
public class InsufficientBalanceExcpetion extends RuntimeException {
	
	public InsufficientBalanceExcpetion(String message) {
		super(message);
	}
}
