package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class CheckFilter implements MyFilter{
	@Override
	public boolean check(int data) {
		// TODO Auto-generated method stub
		return data%2==0;
	}
}
public class MyFilterDemo {

	/**
	 * Take list and print those values from the list
	 * which are even.
	 * If the nos is even or not will be specified by the MyFilter
	 */
	public static void display(MyFilter myFilter, List<Integer> list) {
		for(int n:list)
		{
			if(myFilter.check(n))
				System.out.println(n);
		}
	}
	public static void main(String[] args) {
		
		List<Integer> nos = Arrays.asList(23,34,5,2,6,7,8,9,10);
		
		// since java 16
		nos.stream().filter(n -> n%7==0).toList();
		
		nos.stream().map(value -> value+" >=5 "+(value >=5) )
		.forEach(res-> System.out.println(res));
		
		
		
		//1. creating a class
		System.out.println("Printing even values");
		display(new CheckFilter(), nos);
		
		System.out.println("Printing odd values");
		//2. anonymmous inner class
		display(new MyFilter() {
			
			@Override
			public boolean check(int data) {
				// TODO Auto-generated method stub
				return data%3==0;
			}
		}, nos);
		
		System.out.println("Printing values divisible by 5");
		//2. anonymmous inner class
		display( data -> data%5==0, nos);

	}

}
