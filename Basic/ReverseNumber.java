/*
Problem: Reverse a Number
Category: Basic
Difficulty: Easy

Approach:
- Extract the last digit using modulo operator (%)
- Build the reversed number by multiplying current reversed by 10 and adding last digit
- Remove the last digit from original number using integer division (/)
- Repeat until number becomes 0

Time Complexity: O(log10(n)) where n is the number of digits
Space Complexity: O(1)
*/

class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456789;
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}