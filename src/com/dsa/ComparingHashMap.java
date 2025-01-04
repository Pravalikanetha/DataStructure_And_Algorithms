package com.dsa;
import java.util.HashMap;

public class ComparingHashMap {
	public static boolean func(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
		if(hm1.size()!=hm2.size()){
			return false;
		}
		for(char key : hm1.keySet()) {
			if(!hm2.containsKey(key)) {
				return false;
			}
			int a = hm1.get(key);
			int b = hm2.get(key);
			if(a!=b) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "abcdd";
		String b = "asbcd";
		
		HashMap<Character, Integer> hm1 = new HashMap<>();
		
		HashMap<Character, Integer> hm2 = new HashMap<>();
		
		for(int i=0; i<a.length(); i++) {
			hm1.put(a.charAt(i), hm1.getOrDefault(a.charAt(i), 0)+1);
		}
		
		for(int i=0; i<b.length(); i++) {
			hm2.put(b.charAt(i), hm2.getOrDefault(b.charAt(i), 0)+1);
		}
		
		
		System.out.println(func(hm1, hm2));
	}

}
