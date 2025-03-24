package com.dsa.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "agileeliga";
//		System.out.println(removeDuplicate(str));
//		System.out.println(reverseWords("Welcome to Java World"));
		
//		System.out.println(palindrome2(str));
		
		System.out.println(Anagram("jaava", "aajv"));
	}
	public static boolean Anagram(String s1, String s2) {
		char[] s1ToCharArray = s1.toCharArray();
		char[] s2ToCharArray = s2.toCharArray();
		Arrays.sort(s1ToCharArray);
		Arrays.sort(s2ToCharArray);
		
		return Arrays.equals(s1ToCharArray, s2ToCharArray);
	}
	public static boolean palindrome2(String original) {
		String reverse = "";
		for (int i = 0; i < original.length(); i++) {
			reverse = reverse+original.charAt(i);
		}
		return original.equals(reverse);
	}
	public static boolean palindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		String revered = sb.reverse().toString();
		return s.equals(revered);
	}
	
	public static String removeDuplicate(String s) {
		HashSet<Character> hs = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(!hs.contains(c)) {
				hs.add(c);
				sb.append(c);
			}
		}
		System.out.println(hs);
		return sb.toString();
	}
	public static String reverseWords(String s) {
		String[] array = s.split(" ");
		int  i = 0;
		int j = array.length-1;
		while(i<j) {
			String temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
//		for (int j2 = 0; j2 < array.length; j2++) {
//			System.out.print(array[j2]);
//			if(j2 < array.length-1) {
//				System.out.print(" ");
//			}
//		}
		return Arrays.stream(array)
                .collect(Collectors.joining(" "));
 	}
}
