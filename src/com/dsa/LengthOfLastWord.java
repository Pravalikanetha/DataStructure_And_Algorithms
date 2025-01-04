package com.dsa;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
	String[] splited = s.split(" ");
	int finalword = splited[splited.length-1].length();
	return finalword;
	
    }
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(lengthOfLastWord(s));
	}

}
