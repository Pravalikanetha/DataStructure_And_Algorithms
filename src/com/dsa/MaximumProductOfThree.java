package com.dsa;

import java.util.Arrays;

public class MaximumProductOfThree {
	public static int maxPositiveProduct(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		int max = Integer.MIN_VALUE;
		int l = 0;
		int temp = nums[0];
		for (int r = 1; r < n; r++) {
			temp *= nums[r];
			if (r - l == 3) {
				temp /= nums[l];
				l++;
			}
			if (r - l + 1 == 3) {
				System.out.println("temp" + temp);
				max = Math.max(max, temp);
			}
		}
		return max;
	}

	public static int maxNegativeProduct(int[] nums) {
		Arrays.sort(nums);
        int n = nums.length;
        for (int r = 0; r < n; r++) {
        	System.out.println(nums[r]);
        }
        // Calculate the maximum product
        int maxProduct = Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3], // Three largest
            nums[0] * nums[1] * nums[n - 1]           // Two smallest and largest
        );

        return maxProduct;
	}

	public static void main(String[] args) {
		int[] nums = { -100, -98, -1, 10, 3, 5, 2, 2, 3, 4 };

		System.out.println(maxNegativeProduct(nums));
	}

}
