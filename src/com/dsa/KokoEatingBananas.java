package com.dsa;

public class KokoEatingBananas {
	public static boolean finishWithInHours(int[] piles, int h, int k) {
        for(int i=0; i<piles.length; i++) {
        	int div = piles[i]/k;
        	if(piles[i]%k!=0) {
        		div++;
        	}
        	h-=div;
        	if(h<0) {
        		return false;
        	}
        }
        return true;
	}
    public static int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1000;
        while(l<=r) {
        	int mid = l+(r-l)/2;
        	if(finishWithInHours(piles,h, mid)) {
        		r=mid-1;
        	}else {
        		l=mid+1;
        	}
        }
        return l;
    }
    
	public static void main(String[] args) {
		int[] piles ={2,2};// {30,11,23,4,20};
		int h=2;
		System.out.println(minEatingSpeed(piles, h));
	}

}

























