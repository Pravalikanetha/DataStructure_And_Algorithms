package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {
	public static boolean isAcronym(List<String> words, String s) {

		if (words.size() != s.length()) {
            return false;
        }
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).charAt(0) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String s = "abc";
		words.add("alice");
		words.add("bob");
		words.add("harlie");
		boolean bool = isAcronym(words, s);
		System.out.print(bool);
	}

}
