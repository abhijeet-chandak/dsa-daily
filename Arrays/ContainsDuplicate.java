/*
Problem: Contains Duplicate
Category: Array / Hashing
Difficulty: Easy

Approach:
- Use a HashSet to store elements
- Traverse the array
- If an element already exists in the set, return true
- If traversal completes without duplicates, return false

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
