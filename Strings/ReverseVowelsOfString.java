/*
Problem: Reverse Vowels of a String
Category: String
Difficulty: Easy

Approach:
- Use two pointers technique
- Pointer left starts from beginning, right from end
- Move left pointer until a vowel is found
- Move right pointer until a vowel is found
- Swap the vowels
- Continue until pointers cross

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ReverseVowelsOfString {
    public static void main(String[] args) {

        String s = "hello";
        String result = reverseVowels(s);

        System.out.println("Result: " + result);
    }

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left pointer to next vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // move right pointer to previous vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    // helper method to check vowels
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
