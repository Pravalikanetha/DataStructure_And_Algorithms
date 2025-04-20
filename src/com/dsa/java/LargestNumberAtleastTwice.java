package com.dsa.java;

public class LargestNumberAtleastTwice {
	public static int dominantIndex(int[] nums) {
		int dominant = -1;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
				dominant = i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(max!= nums[i] && max < 2*nums[i]) {
				return -1;
			}
		}

		return dominant;
	}
	public static void main(String[] args) {
		int[] nums = {10,7,20,2,1};
		System.out.println(dominantIndex(nums));
	}
}
