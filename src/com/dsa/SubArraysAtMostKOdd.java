package com.dsa;

public class SubArraysAtMostKOdd {

	public static void main(String[] args) {
		int[] nums = {2,1,3};
		int k =1;
		int n = nums.length;
		int l = 0 ;
		int odds = 0; 
		int ans = 0;
		for(int r=0; r<n; r++) {
			if(nums[r]%2==1) {
				odds++;
			}
			
			while(odds>k) {
				if(nums[l]%2==1) {
					odds--;
				}
				l++;
			}
			ans=ans+r-l+1;
			System.out.println("l="+l+" r="+r);
		}
		System.out.println("SubArraysAtMostKOdd : "+ans);
	}

}
