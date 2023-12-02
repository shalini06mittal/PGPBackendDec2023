package com.lambda;

public class AdditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Addition ob = (x, y) -> return x+y;
		Addition ob = (x, y) -> {
			return x+y;
		};
		ob = (x, y) ->  x+y;
		System.out.println(ob.add(12, 56));
	}

}
