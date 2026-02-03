/*
Problem: Contains Duplicate II
Category: Array / Hashing / Sliding Window
Difficulty: Easy

Approach:
- Use a HashMap to store number and its last index
- Traverse the array
- If the number already exists in the map:
    → check if index difference ≤ k
    → if yes, return true
- Update the index of the current number
- If no valid pair found, return false

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class ContainsDuplicateII {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) &&
                i - map.get(nums[i]) <= k) {
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
