package com.dsa.streams;

public class CompareTwoStrings {
	public static boolean usingEquals(String s1, String s2) {
		return s1.equals(s2);
	}
	public static boolean equalsIngnoreCase(String s1, String s2) {
		return s1.equalsIgnoreCase(s2);
	} 
	public static int compareTo(String s1, String s2) {
		return s1.compareTo(s2);
	}
	public static int compareToIngnoreCase(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
		
	}
	public static boolean objectEquals(String s1, String s2) {
		return s1==s2;
	}
	public static void callAllMethods(String s1, String s2) {
		System.out.println("usingEquals : "+usingEquals(s1, s2));
		System.out.println("equalsIngnoreCase : "+equalsIngnoreCase(s1, s2));
		System.out.println("compareTo : "+compareTo(s1, s2));
		System.out.println("compareToIngnoreCase : "+compareToIngnoreCase(s1, s2));
		System.out.println("objectEquals : "+objectEquals(s1, s2));
	}
	public static void main(String[] args) {
		callAllMethods("Pravalika", "pravalika");
	}
}
