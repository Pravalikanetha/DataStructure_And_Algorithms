package com.dsa.strings;

public class NumberLength {
	public static void length(int number) {
		int length = 0;
		while (number > 0) {
			number /= 10;
			length++;
		}
		System.out.println("Number Length : "+length); 
	}
	public static void main(String[] args) {
		int number = 80431;
		length(number);
	}
}
