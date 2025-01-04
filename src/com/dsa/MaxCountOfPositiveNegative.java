package com.dsa;

public class MaxCountOfPositiveNegative {
	public static void search(int[] nums) {
		int evencount=0;
		int oddcount=0;
		for(int i =0; i<nums.length; i++) {
			if(nums[i]<0) {
				oddcount++;
			}else if(nums[i]==0){
				continue;
			}else {
				evencount++;
			}
		}
		System.out.println("even numbers : "+evencount);
		System.out.println("odd numbers : "+oddcount);
	}

	public static int left(int[] nums, int target) {
		int l = 0;
		int r = nums.length;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}

	public static void main(String[] args) {

		int[] nums = { -3, -2, -1, 0, 0, 1, 2 };
//		int[] nums1 = {-2,-1, 5, 20, 66, 1314 };
		int negative = left(nums,0);
		int positive = left(nums,1)-nums.length;

		System.out.println(Math.max(positive,negative));
		
		search(nums);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
