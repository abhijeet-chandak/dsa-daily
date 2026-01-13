/*
Problem: Valid Parentheses
Category: Stack
Difficulty: Easy

Approach:
- Use a stack to track opening brackets
- Traverse the string character by character
- If opening bracket is found, push it onto the stack
- If closing bracket is found:
    → stack must not be empty
    → top of stack must match the closing bracket
- If mismatch or stack is empty, return false
- At the end, stack should be empty for a valid string

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {

        String s = "()[]{}";
        boolean result = isValid(s);

        System.out.println("Is Valid: " + result);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Handle closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty at the end
        return stack.isEmpty();
    }
}
