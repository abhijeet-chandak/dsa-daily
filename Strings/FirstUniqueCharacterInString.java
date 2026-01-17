/*
Problem: First Unique Character in a String
Category: String / Hashing
Difficulty: Easy

Approach:
- Count frequency of each character
- Traverse the string again to find the first character
  whose frequency is 1
- Return its index
- If no such character exists, return -1

Time Complexity: O(n)
Space Complexity: O(1)   // fixed size array of 26 letters
*/

class FirstUniqueCharacterInString {
    public static void main(String[] args) {

        String s = "leetcode";
        int index = firstUniqChar(s);

        System.out.println("First Unique Character Index: " + index);
    }

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Step 1: count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
