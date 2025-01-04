package com.dsa;

import java.util.HashMap;

public class PermutationString {
	public static boolean checkInclusion(String s1, String s2) {
		int k = s1.length();
		HashMap<Character, Integer> hm1 = new HashMap<>();
		for(int i=0; i<k; i++) {
			char c1 = s1.charAt(i);
			hm1.put(c1, hm1.getOrDefault(c1, 0)+1);
		}
		HashMap<Character, Integer> hm2 = new HashMap<>();
		int l=0;
		for(int r =0; r<s2.length(); r++) {
			char c2 = s2.charAt(r);
			hm2.put(c2, hm2.getOrDefault(c2, 0)+1);
			
			if(r-l==k) {
				char ch=s2.charAt(l);
				hm2.put(ch, hm2.get(ch)-1);
				if(hm2.get(ch)==0) {
					hm2.remove(ch);
				}
				l++;
			}
			
			if(r-l+1==k) {
				if(hm1.equals(hm2)) {
					return true;
				}
				
			}
		}
		return false;
    }
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		
		System.out.print(checkInclusion(s1,s2));
	}

}
