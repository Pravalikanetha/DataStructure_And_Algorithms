package com.dsa.streams;

import java.util.stream.LongStream;

public class Factorial {
	public static void main(String[] args) {
		int num = 90;
		long factorial = factorial(num);
		System.out.println(factorial);
	}
	
	public static long factorial(int num) {
		return LongStream.rangeClosed(1, num).reduce(1, (long a, long b)->(a*b));
	}
}
