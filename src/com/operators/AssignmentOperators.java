package com.operators;

public class AssignmentOperators {
	
	public static void main(String[] args) {
		
		int a = 10;
		a += 5; // equivalent to a = a + 5
		a -= 2; // equivalent to a = a - 2
		a *= 3; // equivalent to a = a * 3
		a /= 2; // equivalent to a = a / 2
		a %= 3; // equivalent to a = a % 3
		a &= 3; // equivalent to a = a & 3
		a |= 5; // equivalent to a = a | 5
		a ^= 2; // equivalent to a = a ^ 2
		a <<= 2; // equivalent to a = a << 2
		a >>= 1; // equivalent to a = a >> 1

		System.out.println(a);
	}

}
