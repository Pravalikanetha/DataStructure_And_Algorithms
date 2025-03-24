package com.dsa.streams;

import java.util.Scanner;

public class FindNumberOfWords {
	static int splits(String s) {
		String[] splitted = s.split(" ");
		return splitted.length;
	}
	static int countWords(String s) {
		int count = 0;
		if(s.charAt(0)!=' ') {
			count+=1;
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count+=1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "Welcome to java world";
		int ans = s.trim().split("\\s+").length;
		System.out.println(ans);
		
		int  i = 5;
		Scanner sc = new Scanner(System.in);
		while(i>0) {
			System.out.println("Enter a String");
			String str = sc.nextLine();
			System.out.println(countWords(str));
			i--;
		}
		sc.close();
	}
}
