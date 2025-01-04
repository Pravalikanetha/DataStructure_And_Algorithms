package com.dsa;

import java.util.HashMap;

public class SubstringsOfSizeThree {
	public static void main(String[] args) {
		String s = "xyzazb";
		int n=s.length();
		int k=3;
		int l=0;
		int max=0;
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int r=0; r<n; r++) {
			hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0)+1);
			
			if(r-l==k) {
				hm.put(s.charAt(l), hm.get(s.charAt(l))-1);
				if(hm.get(s.charAt(l))==0) {
					hm.remove(s.charAt(l));
				}
				l++;
			}
			
			if(hm.size()==k) {
				max++;
			}
		}
		System.out.print("Maximum Substrings Of Size Three: "+max);
	}
}
