package com.dsa.streams;

public class NumberOfCharactersInStringArray {
	public static void NumberOfCharacter(String s){
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			while (i < ch.length && ch[i] != ' ') {
				temp = temp + ch[i];
				i++;
			}
			if(temp.length() > 0) {
				System.out.println(temp + "->" + temp.length());
			}
		}
	}
	public static void main(String[] args) {
		String s = "pravalika";
		NumberOfCharacter(s);
	}
}
