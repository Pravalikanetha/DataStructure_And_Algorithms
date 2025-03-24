package com.dsa.streams;

public class ReverseStringUsingRecursion {
	public static String reverseString(String s) {
		if(s == " " || s.length() <= 1) {
			return s;
		}
		return reverseString(s.substring(1))+s.charAt(0);
	}
	public static void main(String[] args) {
		String s = "Pravalika";
		System.out.println(reverseString(s));
	}
}
