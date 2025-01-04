package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingChars {

	public static void main(String[] args) {
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'z';
		List<Integer> l = new ArrayList<>();
		
		for(int i=0; i<words.length; i++) {
			String s = words[i];
			if(s.indexOf(x) != -1) {
				l.add(i);
			}
		}
		System.out.println(l);
	}

}
