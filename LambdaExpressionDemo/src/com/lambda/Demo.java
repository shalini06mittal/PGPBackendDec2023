package com.lambda;

import java.util.List;
 class PaymentImpl implements Payment{
	@Override
	public void pay() {
		System.out.println("paying... logic");

	}
	@Override
	public void notification() {
		// TODO Auto-generated method stub
		System.out.println("heyyy");
	}
}
public class Demo {

	public static void main(String[] args) {
		/**
		 * PaymentImpl => to provide the implementation of the pay()
		 */
		Payment ob = new PaymentImpl();
		ob.pay();
		ob.notification();
		System.out.println();
		// anonymous inner classes?
		// a class that implements the Payment interface and provides the implementation of pay()
		// shortcut => new ctrl + <spacebar>
		 Payment ob1 = new  Payment() {
			@Override
			public void pay() {
				System.out.println("paying... logic from anonymous inner class");
			}
			@Override
			public void notification() {
				// TODO Auto-generated method stub
				Payment.super.notification();
			}
		};
		ob1.pay();
		ob1.notification();
		System.out.println();
		// lambda expressions => Functional interfaces
		/*
		 * 1. input => parameters
		 * 2. output => return
		 * 3. body => BL
		 */
		// providing implementation of the pay()
		Payment ob2 = () -> {
			System.out.println("Lambda expression for pay");
			System.out.println("asjkdhadk");
		};
		ob2.pay();
		ob2.notification();
		
		Payment ob3 = () -> System.out.println("nice...");
		ob3.pay();
	}

}
