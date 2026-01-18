/*
Problem: Rotate String
Category: String
Difficulty: Easy

Approach:
- If lengths are different → return false
- Concatenate string s with itself
- If goal is a substring of (s + s), rotation is possible
- This works because all rotations of s exist inside (s + s)

Time Complexity: O(n)
Space Complexity: O(n)
*/

class RotateString {
    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);

        System.out.println("Is Rotation: " + result);
    }

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
