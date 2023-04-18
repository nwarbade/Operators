package com.operators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean x = true;
		boolean y = false;
		boolean and = x && y; // logical AND
		boolean or = x || y; // logical OR
		boolean not = !x; // logical NOT

		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
	}

}
