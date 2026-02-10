/*
Problem: Find the Index of the First Occurrence in a String
Category: String
Difficulty: Easy

Approach:
- We need to find the first index where needle occurs in haystack
- If needle is empty, return 0
- Traverse haystack from index 0 to (haystack.length - needle.length)
- For each position:
    → check if substring starting there matches needle
- If match found, return the index
- If no match found, return -1

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

class FirstOccurrenceInString {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("First Occurrence Index: " + result);
    }

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
