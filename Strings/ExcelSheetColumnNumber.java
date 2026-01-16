/*
Problem: Excel Sheet Column Number
Category: Math / String
Difficulty: Easy

Approach:
- Treat the column title as a base-26 number
- Traverse characters from left to right
- For each character:
    → Convert 'A'–'Z' to 1–26
    → Multiply current result by 26 and add the value
- Return the final result

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        String columnTitle = "AB";
        int result = titleToNumber(columnTitle);

        System.out.println("Column Number: " + result);
    }

    public static int titleToNumber(String columnTitle) {

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1; // 'A' → 1, 'B' → 2, ...
            result = result * 26 + value;
        }

        return result;
    }
}
