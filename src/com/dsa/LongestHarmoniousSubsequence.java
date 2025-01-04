package com.dsa;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		int[] nums = {1,3,2,2,5,2,3,7};
		
		int n=nums.length;
		int count=0;
		int max=0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int r=0; r<n; r++) {
			hm.put(nums[r], hm.getOrDefault(nums[r], 0)+1);
		}
		
		for(int key : hm.keySet()) {
			if(hm.containsKey(key+1)) {
				count = hm.get(key)+hm.get(key+1);
			}
			max = Math.max(max, count);
		}
		
		System.out.print(max);
	}
}


/*
 * Output: 5
 * 
 * Explanation:
 * 
 * The longest harmonious subsequence is [3,2,2,2,3]

		1->1
		2->3
		3->2
		5->1
		7->1
		
 */