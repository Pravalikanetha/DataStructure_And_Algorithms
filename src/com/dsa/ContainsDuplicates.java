package com.dsa;

import java.util.HashMap;

public class ContainsDuplicates {
	public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
        	if(hm.containsKey(nums[i])) {
        		return true;
        	}else {
        		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		Boolean ans = containsDuplicate(nums);
		System.out.println(ans);
	}
}
