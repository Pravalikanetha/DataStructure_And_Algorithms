package com.dsa;

import java.util.HashMap;

public class SubArrayWithKdiff {
	public static int atmostK(int[] nums, int k) {
		int n = nums.length;
		int l =0;
		int max = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int r = 0; r<n; r++) {
			hm.put(nums[r], hm.getOrDefault(nums[r], 0)+1);
			
			while(hm.size()>k) {
				hm.put(nums[l], hm.get(nums[l])-1);
				if(hm.get(nums[l])==0) {
					hm.remove(nums[l]);
				}
				l++;
			}
			max=max+r-l+1;
		}
		return max;
    }
	public static int subarraysWithKDistinct(int[] nums, int k) {
		System.out.println("atmostK(nums, k-1)"+atmostK(nums, k-1));
        return atmostK(nums, k)-atmostK(nums, k-1);
    }
	public static void main(String[] args) {
		int[] nums = {1,2,1,2,4};
		int k = 2;
		
		System.out.println(subarraysWithKDistinct(nums,k));
	}
}
















