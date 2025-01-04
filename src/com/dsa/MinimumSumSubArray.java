package com.dsa;

public class MinimumSumSubArray {
	public static int minSubArrayLen(int target, int[] nums) {
		int n=nums.length;
		int min=Integer.MAX_VALUE;
		int l=0;
		int temp=0;
		
		for(int r=0; r<n; r++) {
			temp+=nums[r];
			
			while(temp>=target) {
				min=Math.min(min, r-l+1);
				temp-=nums[l];
				l++;
			}
		}
		if(min==Integer.MAX_VALUE) {
			return 0;
		}
		
		return min;
    }
	public static void main(String[] args) {
		
		int target = 4;
		int nums[] = {1,4,4};
		int ans = minSubArrayLen(target,nums);
		System.out.print(ans);
	}

}
