package com.dsa.lambda;

@FunctionalInterface
interface A  {
	int add(int i, int j);
}

public class LambdaReturn {
	public static void main(String[] args) {
		A obj = (i, j) -> {
			i = i+i;
			j= j+j-10;
			System.out.println("i "+i);
			System.out.println("j "+j);
			return i+j;
		};
		int result = obj.add(4, 50);
		System.out.println(result);
	}
}