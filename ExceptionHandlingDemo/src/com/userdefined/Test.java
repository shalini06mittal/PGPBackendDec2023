package com.userdefined;

public class Test {

	public static void main(String[] args) throws InsufficientBalanceExcpetion {
		
		System.out.println(Integer.parseInt("A1B", 16));
		
		Account a1 = new Account();
		a1.setAid(1);
		a1.setBalance(5000);
		
		
		System.out.println(a1.withdraw(12000));
		
		try {
		System.out.println(a1.withdraw(3500));
		}catch(InsufficientBalanceExcpetion e)
		{
			//System.out.println(e.getMessage());
			// generate logs
		}

		try {
			System.out.println(a1.withdraw(1000));
		} catch (InsufficientBalanceExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Account a2 = new Account();
		a2.setAid(2);
		a2.setBalance(15000);
		a2.withdraw(5000);
	}

}
