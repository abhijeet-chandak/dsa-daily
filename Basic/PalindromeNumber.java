/*
Problem: Palindrome Number
Category: Math
Difficulty: Easy

Approach:
- Negative numbers are not palindrome
- Numbers ending with 0 (except 0 itself) cannot be palindrome
- Reverse only half of the number
- Compare first half with reversed second half

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class PalindromeNumber {
    public static void main(String[] args) {

        int x = 121;

        boolean result = isPalindrome(x);

        System.out.println("Is Palindrome: " + result);
    }

    public static boolean isPalindrome(int x) {

        // Negative numbers and numbers ending with 0 are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {

            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even digits → x == reversedHalf
        // For odd digits → x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
