package com.dsa;

public class FindGreatestCharacter {
	public static char greatest(char[] arr, char target) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(arr[mid]< target) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		System.out.println(r);
		return arr[r];
	}
	public static void main(String[] args) {
		char[] arr = {'c','e','g','k', 'y'};
		char target= 'h';
		System.out.println(greatest(arr, target));
	}

}
