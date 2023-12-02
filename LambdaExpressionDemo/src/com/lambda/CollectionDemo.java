package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.digitalocean.com/community/tutorials/java-8-stream

/**
 * Task
 * 
 * Create an Invoice class -> invno, date, email, amount, city
 * 
 * Create a list of Invoice objects
 * 
 * 1. Print all the invoices for the customers residing in a particular city
 * 2. Get the list of emails of all the customers residing in a particular city
 * 3. Get the total amount of all the invoices for a customer, likewise do for all the customers
 * and print those customer email whose invoice total is > 10k
 * @author Shalini
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(7);
		nos.add(5);
		nos.add(90);
		nos.add(3);
		nos.add(1);

		for(int n : nos) {
			System.out.println(n*n);
		}
		
		System.out.println();
		nos.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t*t*t);
				
			}
		});
		
		nos.forEach(no-> System.out.println(Math.sqrt(no)));
		
		/**
		 * iterate over the list
		 * for each value in the list calculate the squares 
		 * return the new list with square values
		 */
		
		// map
		Stream<Integer> stream = nos.stream();
		Stream<Integer> streamMap = stream.map(n -> n*n);
		List<Integer> squares = streamMap.collect(Collectors.toList());
		System.out.println(squares);
		
		List<Integer> s1 = nos.stream().map(n-> n*n)
				.collect(Collectors.toList());
		
		List<Integer> evenList = nos.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		nos.stream().filter(n->n%2==0)
		.map(n-> Math.sqrt(n))
		.forEach(value -> System.out.println(value));
		
	}

}
