package com.userdefined;

import javax.naming.InsufficientResourcesException;

public class Test {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAid(1);
		a1.setBalance(5000);
		
		System.out.println(a1.withdraw(2000));
		try {
		System.out.println(a1.withdraw(3500));
		}catch(InsufficientBalanceExcpetion e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println(a1.withdraw(1000));
	}

}
