/*
Problem: Valid Anagram
Category: String / Hashing
Difficulty: Easy

Approach:
- If lengths are different, they cannot be anagrams
- Use a frequency array of size 26
- Increment count for characters in string s
- Decrement count for characters in string t
- If all values in frequency array are zero,
  the strings are anagrams

Time Complexity: O(n)
Space Complexity: O(1)   // fixed-size array
*/

class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Count characters in s
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Remove characters using t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Check frequency array
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
