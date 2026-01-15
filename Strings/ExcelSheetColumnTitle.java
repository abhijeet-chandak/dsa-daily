/*
Problem: Excel Sheet Column Title
Category: Math / String
Difficulty: Easy

Approach:
- Excel columns are 1-based (A = 1, B = 2, ..., Z = 26)
- Subtract 1 from columnNumber to handle 1-based indexing
- Convert the number to base-26
- Map each remainder to a character from 'A' to 'Z'
- Build the string in reverse order and reverse it at the end

Time Complexity: O(log₍26₎ n)
Space Complexity: O(log₍26₎ n)
*/

class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        int columnNumber = 28;
        String result = convertToTitle(columnNumber);

        System.out.println("Column Title: " + result);
    }

    public static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--; // adjust for 1-based indexing

            char c = (char) ('A' + (columnNumber % 26));
            sb.append(c);

            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
