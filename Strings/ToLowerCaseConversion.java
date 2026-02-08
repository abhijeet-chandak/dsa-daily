/*
Problem: To Lower Case
Category: String
Difficulty: Easy

Approach:
- Traverse each character of the string
- If the character is uppercase ('A' to 'Z'):
    → convert it to lowercase by adding 32
- Append characters to StringBuilder
- Return the final string

Time Complexity: O(n)
Space Complexity: O(n)
*/

class ToLowerCaseConversion {
    public static void main(String[] args) {

        String s = "Hello";

        String result = toLowerCase(s);

        System.out.println("Lowercase String: " + result);
    }

    public static String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
