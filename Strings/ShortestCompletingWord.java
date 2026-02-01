/*
Problem: Shortest Completing Word
Category: String / Hashing
Difficulty: Easy

Approach:
- Count frequency of letters in the license plate
- Ignore digits and spaces
- Convert all letters to lowercase
- For each word:
    → count its letter frequency
    → check if it contains all required letters
- Choose the shortest valid completing word

Time Complexity: O(n * m)
Space Complexity: O(1)   // fixed-size arrays of length 26
*/

import java.util.*;

class ShortestCompletingWord {
    public static void main(String[] args) {

        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};

        String result = shortestCompletingWord(licensePlate, words);

        System.out.println("Shortest Completing Word: " + result);
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        int[] required = new int[26];

        // Count required letters from license plate
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                required[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String answer = null;

        // Check each word
        for (String word : words) {

            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean isValid = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] < required[i]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                if (answer == null || word.length() < answer.length()) {
                    answer = word;
                }
            }
        }

        return answer;
    }
}
