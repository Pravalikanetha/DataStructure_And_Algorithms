package com.dsa;

public class FindSmallestDivisorForGivenThreshold {
	static boolean ispossible(int[] nums, int threshold, int k) {
		
		for(int i=0; i<nums.length; i++) {
			int div = nums[i]/k;
			if(nums[i]%k!=0) {
				div++;
			}
//			sum +=div;
			threshold-=div;
			if(threshold<0) {
				return false;
			}
		}
		
//		if(sum<=threshold) {
//			return true;
//		}else {
//			return false;
//		}
		return true;
	}
	static int smallestDivisor(int[] nums, int threshold) {
		int l=1; 
		int r=1000000;

		while(l<=r) {
			int mid = l+(r-l)/2;
			if(ispossible(nums, threshold, mid)) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		 return l;
    }
	public static void main(String[] args) {
		
		int[] nums = {44,22,33,11,1};
		int threshold = 5;
	
		System.out.println(smallestDivisor(nums, threshold));
	}

}
























