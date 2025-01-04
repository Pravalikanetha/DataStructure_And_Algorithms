package com.dsa;

public class longestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = {2,2,2,2,2};
		
		int count =1;
		int max=1;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i+1]>nums[i]) {
				count++;
				max = Math.max(max, count);
				System.out.println(i +"->"+(i+1));
			}
			else {
				count = 1;
			}
		}
		System.out.println(max);
	}

}
