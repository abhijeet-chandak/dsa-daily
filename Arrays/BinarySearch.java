/*
Problem: Binary Search
Category: Array
Difficulty: Easy

Approach:
- Use binary search since the array is sorted
- Maintain two pointers: left and right
- Calculate mid index
- If nums[mid] equals target, return mid
- If nums[mid] is greater than target, search left half
- If nums[mid] is smaller than target, search right half
- If target is not found, return -1

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int index = search(nums, target);

        System.out.println("Index: " + index);
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] > target) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
