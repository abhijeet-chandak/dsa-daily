/*
Problem: Roman to Integer
Category: String
Difficulty: Easy

Approach:
- Use a HashMap to store Roman numeral values
- Traverse the string from left to right
- If the current value is less than the next value:
    → subtract the current value
- Otherwise:
    → add the current value
- This handles special cases like IV, IX, XL, etc.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.HashMap;

class RomanToInteger {
    public static void main(String[] args) {

        String s = "MCMXCIV";
        int result = romanToInt(s);

        System.out.println("Integer Value: " + result);
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        return sum;
    }
}
