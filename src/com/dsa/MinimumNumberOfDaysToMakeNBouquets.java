package com.dsa;

public class MinimumNumberOfDaysToMakeNBouquets {
	public static boolean isPossible(int[] bloomDay, int m, int k, int d) {
		int n = bloomDay.length;
		int took = 0;
		for (int i = 0; i < n; i++) {
			if (bloomDay[i] <= d) {
				took += 1;
			} else {
				took = 0;
			}

			if (took == k) {
				m -= 1;
				took=0;
			}
			if (m == 0) {
				return true;
			}
		}
		return false;
	}

	public static int minDays(int[] bloomDay, int m, int k) {
//		if(bloomDay.length!=m*k)return -1;
		int l=1;
		int r=(int) Math.pow(10, 9);
		
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(isPossible(bloomDay,m, k, mid)) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(l==(int) Math.pow(10, 9)) {
			return -1;
		}
		return l;
	}

	public static void main(String[] args) {
		int[] bloomDay = {1,10,3,10,2};
		int m=3;
		int k=2;
		
		System.out.println(minDays(bloomDay,m,k));
	}

}
