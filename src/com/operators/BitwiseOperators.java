package com.operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		
		int a = 60; // 0011 1100
		int b = 13; // 0000 1101
		
		
		int and = a & b; // bitwise AND (0000 1100)
		int or = a | b; // bitwise OR (0011 1101)
		int xor = a ^ b; // bitwise XOR (0011 0001)
		int complement = ~a; // bitwise complement (1100 0011)
		int leftShift = a << 2; // left shift by 2 (1111 0000)
		int rightShift = a >> 2; // right shift by 2 (0000 1111)
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(xor);
		System.out.println(complement);
		System.out.println(leftShift);
		System.out.println(rightShift);
		

	}

}
