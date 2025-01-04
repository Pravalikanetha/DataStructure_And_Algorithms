package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import java.util.*;

public class FindAllAnagram {
//    public static boolean func(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
//        if (hm1.size() != hm2.size()) {
//            return false;
//        }
//        for (char key : hm1.keySet()) {
//            if (!hm2.containsKey(key) || hm2.get(key) != hm1.get(key)) {
//                return false;
//            }
//        }
//        return true;
//    }

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> hmp = new HashMap<>();

        for (char ch : p.toCharArray()) {
            hmp.put(ch, hmp.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> hms = new HashMap<>();
        int k = p.length();
        int n = s.length();
        int l = 0;

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            hms.put(ch, hms.getOrDefault(ch, 0) + 1);
            
            if (r - l + 1 > k) {
                char chl = s.charAt(l);
                hms.put(chl, hms.get(chl) - 1);
                if (hms.get(chl) == 0) {
                    hms.remove(chl);
                }
                l++;
            }

            if (r - l + 1 == k) {
                if (hmp.equals(hms)) {
                    list.add(l);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        List<Integer> list = findAnagrams(s, p);
        System.out.print(list);
    }
}
