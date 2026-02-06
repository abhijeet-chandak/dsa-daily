/*
Problem: Intersection of Two Arrays II
Category: Array / Hashing
Difficulty: Easy

Approach:
- Use a HashMap to store frequency of elements from nums1
- Traverse nums2 and check if element exists in the map
- If exists and frequency > 0:
    → add element to result list
    → decrease frequency
- Convert result list to array and return

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

import java.util.*;

class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count frequency of nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find intersection
        for (int num : nums2) {

            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
