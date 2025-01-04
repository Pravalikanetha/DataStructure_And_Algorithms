package com.dsa.recursion;

public class Recursion {
	public static void main(String[] args) {
		walk(20);
		
		System.out.println(factorial(7));
		System.out.println(power(2,4));
	}

	private static int power(int base, int exponent) {
		if(exponent<1)return 1;
		System.out.println("You are exponent");
		System.out.println(exponent-2);
		return base * power(base, exponent-1);
	}

	private static int factorial(int num) {
		if(num<1) return 1;
		System.out.println(num-1);
		return num*factorial(num-1);
	}

	private static void walk(int steps) {
		if(steps<1)return;
		System.out.println("You are walking");
		System.out.println(steps-2);
		walk(steps-2);
	}
	
	
}