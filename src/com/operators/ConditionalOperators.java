package com.operators;

public class ConditionalOperators {
	
	public static void main(String[] args) {
		
		
		int a = 7;
		int b = 5;
		int max = (a > b) ? a : b; // if a is greater than b, assign a
		int min = (a < b) ? a : b;
		System.out.println(max);
		System.out.println(min);
	}

}
