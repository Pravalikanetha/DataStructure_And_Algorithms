package com.dsa;

public class MaximumAverageSubarray {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,4};
		int k = 1;
		int n = nums.length;
		int l=0;
		float max = Integer.MIN_VALUE;
		int temp = 0;
		
		for(int r=0; r<n; r++) {
			temp+=nums[r];
			
			if(r-l==k) {
				temp-=nums[l];
				l++;
			}
			
			if(r-l+1==k) {
				max = Math.max(max, (float)temp/k);
			}
		}
		System.out.print(max);
	}
}
