package com.dsa;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the last digit backwards
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return the result if no carry over
            }
            digits[i] = 0; // Set the current digit to 0 and carry over to the next one
        }

        // If all the digits were 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1, others are automatically 0

        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {4, 3, 2, 9};  // Example case without carry
        int[] digits2 = {9,9,9};  // Example case with carry

        System.out.println(Arrays.toString(plusOne(digits1))); // Output: [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(digits2))); // Output: [1, 0]
    }
}
















