package com.dsa;

public class ReverseInteger {
	public static int reverse(int n) {
		int res = 0;
		int sign = n < 0 ? -1 : 1;
		n = Math.abs(n);
		while (n > 0) {
			int temp = n % 10;
			 if (res > (Integer.MAX_VALUE - temp) / 10) {
			 return 0; 
			 }
			res = res * 10 + temp;
			n /= 10;
		}
		return res * sign;
	}

	public static void main(String[] args) {
		int n = -123;
		
		System.out.println("the reversed number is " + reverse(n));

	}

}
