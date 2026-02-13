/*
Problem: Find the Sum of Encrypted Integers
Category: Array / Math
Difficulty: Easy

Approach:
- For each integer in the array:
    → Find the maximum digit in the number
    → Count number of digits in that number
    → Create a new number using the maximum digit repeated
- Add all encrypted numbers and return the sum

Time Complexity: O(n * d)   // d = number of digits
Space Complexity: O(1)
*/

class SumOfEncryptedIntegers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int result = sumOfEncryptedInt(nums);

        System.out.println("Sum of Encrypted Integers: " + result);
    }

    public static int sumOfEncryptedInt(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += encrypt(num);
        }

        return sum;
    }

    // Helper method to encrypt a number
    private static int encrypt(int num) {

        int maxDigit = 0;
        int temp = num;
        int digitCount = 0;

        // Find maximum digit and count digits
        while (temp > 0) {
            int digit = temp % 10;
            maxDigit = Math.max(maxDigit, digit);
            digitCount++;
            temp /= 10;
        }

        // Create encrypted number
        int encrypted = 0;
        for (int i = 0; i < digitCount; i++) {
            encrypted = encrypted * 10 + maxDigit;
        }

        return encrypted;
    }
}
