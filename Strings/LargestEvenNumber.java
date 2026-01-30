/*
Problem: Largest Even Number
Category: String
Difficulty: Easy

Approach:
- We are allowed to remove at most one digit
- The order of digits must remain the same
- A number is even if its last digit is even

Steps:
1. If the last digit is already even, return the string
2. Otherwise, remove one digit to make the number even
3. To get the largest possible number:
   → remove the rightmost odd digit
4. After removal, check if the resulting number ends with an even digit
5. If no valid even number can be formed, return empty string

Time Complexity: O(n)
Space Complexity: O(n)
*/

class LargestEvenNumber {
    public static void main(String[] args) {

        String s = "221";

        String result = largestEven(s);

        System.out.println("Largest Even Number: " + result);
    }

    public static String largestEven(String s) {

        int n = s.length();

        // Case 1: already even
        if ((s.charAt(n - 1) - '0') % 2 == 0) {
            return s;
        }

        // Case 2: remove one digit
        for (int i = n - 1; i >= 0; i--) {

            int digit = s.charAt(i) - '0';

            // remove an odd digit
            if (digit % 2 == 1) {

                String candidate =
                        s.substring(0, i) + s.substring(i + 1);

                if (!candidate.isEmpty() &&
                    (candidate.charAt(candidate.length() - 1) - '0') % 2 == 0) {
                    return candidate;
                }
            }
        }

        // No even number possible
        return "";
    }
}
