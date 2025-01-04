package com.dsa;

public class RomonToInteger {
	public static int value(char c) {
		if (c == 'I')
			return 1;
		if (c == 'V')
			return 5;
		if (c == 'X')
			return 10;
		if (c == 'L')
			return 50;
		if (c == 'C')
			return 100;
		if (c == 'D')
			return 500;
		if (c == 'M')
			return 1000;
		else
			return -1;
	}
	//XXVII
	public static int romanToInt(String s) {
		int n = s.length();
		int sum=0;
		for(int i=0; i<n; i++) {
			int c1 = value(s.charAt(i));
			if(i+1<n) {
				int c2 = value(s.charAt(i+1));
				if(c1>=c2) {
					sum+=c1;
				}else {
					sum+=(c2-c1);
					i++;
				}
			}
			else {
				sum+=c1;
			}
		}
		return sum;
	}
	public static int parentesis() {
		char s = '(';
		char s1 = ')';
		if(s==s1) {
			return 0;
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		String s = "XIX";
		System.out.println(romanToInt(s));
		System.out.println();
		System.out.println(parentesis());
	}

}
