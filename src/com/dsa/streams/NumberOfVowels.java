package com.dsa.streams;

public class NumberOfVowels {
	public static int countVowels(String s) {
		int count = 0;
		for(char c : s.toCharArray()) {
			switch(c) {
			case 'a','e', 'i','o','u':
				count+=1;
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s = "pravalika";
		System.out.println("number of Vowels in '"+s+"' : "+ countVowels(s));
	}
}
