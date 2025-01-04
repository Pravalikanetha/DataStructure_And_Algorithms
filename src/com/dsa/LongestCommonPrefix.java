package com.dsa;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        // Find the length of the shortest string
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Compare characters of each string
        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return prefix.toString(); // Return prefix if mismatch is found
                }
            }
            prefix.append(currentChar); // Append to the prefix if all match
        }

        return prefix.toString(); // Return the longest common prefix
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }

}
