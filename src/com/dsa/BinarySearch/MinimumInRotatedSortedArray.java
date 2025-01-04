package com.dsa.BinarySearch;

public class MinimumInRotatedSortedArray {
	public static int findMin(int[] nums) {
		int low = 0;
		int high = nums.length-1;
		int ans = Integer.MAX_VALUE;
		while(low <= high) {
			int mid = low+(high-low)/2;
			if(nums[low]<=nums[high]) {
				ans=Math.min(ans, nums[low]);
				break;
			}
			if(nums[low] <= nums[mid]) {
				ans=Math.min(ans, nums[low]);
				low=mid+1;
			}else {
				high=mid-1;
				ans=Math.min(ans, nums[mid]);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin(nums));
	}
}
