/*
Problem: Two Sum
Category: Array
Difficulty: Easy

Approach:
- Use HashMap to store number and its index
- For each number, calculate the required complement (target - current number)
- If complement exists in map, return the indices
- Otherwise, add current number and index to map

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // Brute Force Approach - O(n^2) time, O(1) space
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     throw new IllegalArgumentException("No two sum solution");
    // }
}
