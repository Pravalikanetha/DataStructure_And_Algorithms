package com.dsa.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String s1 = "hhjjiiOQJSN";
		nonRepeated(s1);
		String s2 = "aabbZef";
		nonRepeated2(s2);
	}
	public static void nonRepeated2(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First NonRepeated Character 2 : "+entry.getKey());
				return;
			}
		}
	}
	public static void nonRepeated(String s) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (Character c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		char ans = ' ';
		for(char c : hm.keySet()) {
			if(hm.get(c) == 1) {
				ans = c;
				break;
			}
		}
		System.out.println("First NonRepeated Character 1 : "+ans);
	}
	
}
