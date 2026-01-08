/*
Problem: Remove Duplicates from Sorted Array
Category: Array
Difficulty: Easy

Approach:
- Use two pointers technique
- Pointer i tracks the position for unique elements
- Pointer j iterates through the array
- When nums[i] != nums[j], increment i and copy nums[j] to nums[i]
- Return i + 1 as the length of unique elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);

        System.out.println("Length: " + length);
        System.out.print("Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
