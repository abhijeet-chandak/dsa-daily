/*
Problem: Set Mismatch
Category: Array / Hashing
Difficulty: Easy

Approach:
- Use a frequency array of size n + 1
- Traverse nums and count occurrences of each number
- The number with frequency 2 → duplicate number
- The number with frequency 0 → missing number
- Return both numbers in an array [duplicate, missing]

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class SetMismatch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int[] result = findErrorNums(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] freq = new int[n + 1];

        // Count occurrences
        for (int num : nums) {
            freq[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
