package com.dsa.recursion;

public class PrintIncreasing {
	public static void print(int n) {
		if(n==1) {
			System.out.println("one->"+n);
			return;
		}
		System.out.println("first->"+n);
		print(n-1);
		System.out.println("Second->"+n);
	}
	public static void printfactors(int n) {
		
	}
	public static void main(String[] args) {
		int n = 5;
		print(n);
	}
}
