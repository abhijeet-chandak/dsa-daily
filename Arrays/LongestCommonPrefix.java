/*
Problem: Longest Common Prefix
Category: String
Difficulty: Easy

Approach:
- If the array is empty, return an empty string
- Take the first string as the initial prefix
- Compare the prefix with each string in the array
- While the current string does not start with the prefix:
    → shorten the prefix by removing the last character
- If prefix becomes empty, return empty string
- After checking all strings, return the prefix

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
