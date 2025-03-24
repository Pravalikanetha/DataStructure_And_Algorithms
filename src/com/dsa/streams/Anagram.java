package com.dsa.streams;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		String sortedStr1 = str1.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		String sortedStr2 = str2.toLowerCase().chars().sorted()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return sortedStr1.equals(sortedStr2);
	}
	
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		
		System.out.println(isAnagram( str1,  str2));
		System.out.println(str1.equals(str2));
		
	}
}
 