/*
Problem: Valid Palindrome
Category: String
Difficulty: Easy

Approach:
- Use two pointers technique
- Pointer left starts from beginning, right from end
- Ignore non-alphanumeric characters
- Convert characters to lowercase before comparison
- If characters mismatch, return false
- If pointers cross without mismatch, return true

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // compare characters
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
