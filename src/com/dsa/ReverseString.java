package com.dsa;

public class ReverseString {
	public static String reverseString(String s) {
		char[] array = s.toCharArray();
		int n = s.length();
		int i=0;
		int j=n-1;
		
		while(i<j) {
			char temp = array[i];
			array[i]=array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		return new String(array);
    }
	public static void main(String[] args) {
		String s = "Geeks";
		System.out.print(reverseString(s));
	}

}
