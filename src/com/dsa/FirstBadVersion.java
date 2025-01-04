package com.dsa;

public class FirstBadVersion {
	public static int left(int[] nums, int target) {
		int n=nums.length;
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(nums[mid]>=target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		int[] nums = { 0,0,0,0,0,0,1,1,1,1,1};
		int target = 1;
		
		System.out.println(left(nums,target));
	}

}
