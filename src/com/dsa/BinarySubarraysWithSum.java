package com.dsa;

public class BinarySubarraysWithSum {
	public static int atMostK(int[] nums, int k) {
		int n = nums.length;
		int l = 0;
		int temp=0;
		int ans = 0;
		if(k<0) {
			return 0;
		}
		for(int r =0; r<n; r++) {
			temp+=nums[r];
			
			while(temp>k) {
				temp-=nums[l];
				l++;
			}
			ans+=(r-l+1);
		}
		return ans;
    }//
	public static void main(String[] args) {
		int[] nums = {0,0,0,0,0};
		int goal = 0;
		int solution = atMostK(nums, goal) - atMostK(nums, goal-1);
		
		System.out.println(solution);
	}
}
