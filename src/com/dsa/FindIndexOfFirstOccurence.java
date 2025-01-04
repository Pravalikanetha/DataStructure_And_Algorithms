package com.dsa;

//import java.util.ArrayList;
//import java.util.List;

public class FindIndexOfFirstOccurence {
	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}

		int i = haystack.indexOf(needle);
		
		return i;
	}
	
	public static void main(String[] args) {
		String haystack = "leetcode";
		String needle = "leeto";
//		String haystack1 = "butsad";
//		String needle1 = "sad";
		int ans = strStr(haystack, needle);
		System.out.println(ans);
	}

}
