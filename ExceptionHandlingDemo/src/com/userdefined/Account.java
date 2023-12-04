package com.userdefined;

public class Account {

	private int aid;
	private double balance;//5000

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {

		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amount) throws InsufficientBalanceExcpetion  { // 12000
		if(amount > balance)
			throw new InsufficientBalanceExcpetion("Cannot withdraw");
			
		balance -= amount;
		return balance;

	}
}
