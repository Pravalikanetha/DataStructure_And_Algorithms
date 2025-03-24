package com.dsa.strings;

public class StringBuilders {
	public static String reverse() {
        String s = "pravalika";
        StringBuilder sb = new StringBuilder(s).reverse();
//        int l = 0;
//        int r = s.length() - 1;
//        while(l<=r){
//        	char left = sb.charAt(l);
//        	char right = sb.charAt(r);
//        	sb.setCharAt(l, right);
//            sb.setCharAt(r, left);
//            l++;
//            r--;
//        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(reverse());
	}
}
