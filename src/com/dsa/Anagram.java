package com.dsa;

import java.util.HashMap;

public class Anagram {
	public static boolean isAnagram(String str1, String str2) {
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for(int i=0; i<str1.length(); i++) {
        	char c = str1.charAt(i);
        	hm1.put(c, hm1.getOrDefault(c, 0)+1);
        }
        
        for(int i=0; i<str2.length(); i++) {
        	char c = str2.charAt(i);
        	hm2.put(c, hm2.getOrDefault(c, 0)+1);
        }
        
        if(hm1.equals(hm2)) {
        	return true;
        }else {
        	return false;
        }
    }
	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";

		boolean ans =isAnagram(str1, str2);
		
		System.out.print(ans);
		
		
	}

}
