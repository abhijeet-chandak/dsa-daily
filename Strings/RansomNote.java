/*
Problem: Ransom Note
Category: String / Hashing
Difficulty: Easy

Approach:
- Use a frequency array of size 26
- Count characters in the magazine string
- For each character in ransomNote:
    → decrease its count
    → if count becomes negative, return false
- If all characters are available, return true

Time Complexity: O(n + m)
Space Complexity: O(1)   // fixed-size array
*/

class RansomNote {
    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Can Construct: " + result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count magazine characters
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        // Check ransom note characters
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            freq[index]--;

            if (freq[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
