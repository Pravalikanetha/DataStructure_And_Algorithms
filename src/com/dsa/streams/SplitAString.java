package com.dsa.streams;

import java.util.List;
import java.util.regex.Pattern;

public class SplitAString {
	public static void main(String[] args) {
		String s = "0998-87432838";
		String split[] = s.split("-");
		printString(split, "Split");
		
		List<String> list = Pattern.compile("-").splitAsStream(s).toList() ;
		System.out.println(list);
	}
	
	public static void printString(String[] str, String approach) {
		System.out.println("Splitting the String using : " + approach);
		for(String s : str) {
			System.out.println(s);
		}
	}
}
