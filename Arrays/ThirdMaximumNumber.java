/*
Problem: Third Maximum Number
Category: Array
Difficulty: Easy

Approach:
- We need the third distinct maximum number
- Use three variables to track:
    → first maximum
    → second maximum
    → third maximum
- Ignore duplicate values
- Update values while traversing the array
- If third maximum does not exist, return the maximum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ThirdMaximumNumber {
    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 1};

        int result = thirdMax(nums);

        System.out.println("Third Maximum Number: " + result);
    }

    public static int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third == null || n > third) {
                third = n;
            }
        }

        return (third == null) ? first.intValue() : third.intValue();
    }
}
