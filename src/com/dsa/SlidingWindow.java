package com.dsa;

public class SlidingWindow {
	
	public static void main(String[] args) {
		int[] arr= {5,9,1,8,7};
		int k=3;
		int l=0;
		int n=arr.length;
		int temp = 0;
		int max= 0;
		for(int r=0; r<n; r++) {
			temp+=arr[r];
			
			if(r-l==k) {
				temp-=arr[l];
				//System.out.println(temp);
				l++;
			}
			
			if(r-l+1==k) {
				System.out.println("temp"+temp);
				max=Math.max(max,temp);
			}
		}
		System.out.print(max);
	}
}
