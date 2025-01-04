package com.dsa;
import java.util.*;

public class FindDisappearedNumber {
	static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> Disappeared = new ArrayList<>();
//        Arrays.sort(nums);
        int n = nums.length;
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0; i<n; i++) {
        	hs.put(nums[i], hs.getOrDefault(nums[i], 0)+1);
        }
        
        System.out.println(hs);
        for(int i=0 ; i<n; i++) {
        	if(!hs.containsKey(i+1)) {
        		Disappeared.add(i+1);
        	}
        }
        return Disappeared;
    }
	public static void main(String[] args) {
		int[] nums = {1,1};
		
		List<Integer> l = findDisappearedNumbers(nums);
		System.out.println(l);
	}

}
