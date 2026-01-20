/*
Problem: Reverse String
Category: String / Two Pointers
Difficulty: Easy

Approach:
- Use two pointers technique
- Pointer left starts from beginning
- Pointer right starts from end
- Swap characters at left and right
- Move pointers inward until they meet
- Modify the array in-place

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ReverseString {
    public static void main(String[] args) {

        char[] s = {'h','e','l','l','o'};
        reverseString(s);

        System.out.print("Reversed String: ");
        for (char c : s) {
            System.out.print(c);
        }
    }

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
