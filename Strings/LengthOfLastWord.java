/*
Problem: Length of Last Word
Category: String
Difficulty: Easy

Approach:
- Start scanning the string from the end
- Skip trailing spaces
- Count characters until a space is found
- The count obtained is the length of the last word

Time Complexity: O(n)
Space Complexity: O(1)
*/

class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "Hello World   ";
        int length = lengthOfLastWord(s);

        System.out.println("Length of Last Word: " + length);
    }

    public static int lengthOfLastWord(String s) {

        int count = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
