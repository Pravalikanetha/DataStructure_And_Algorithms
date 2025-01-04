package com.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
//		String a = "a.";
		String[] words = paragraph.toLowerCase().split("[^a-z]+");
		
		String[] banned = {"hit"};
		HashSet<String> bannedWords = new HashSet<>(Arrays.asList(banned));
		
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i=0 ; i<words.length; i++) {
			if(!bannedWords.contains(words[i])) {
				hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
			}
		}
		HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
		String result = "";
        int max = 0;
        for (String word : hm.keySet()) {
            if (hm.get(word) > max) {
                result = word;
                max = hm.get(word);
            }
        }
		System.out.println(result);
	}
}
