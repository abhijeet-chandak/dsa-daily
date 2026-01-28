/*
Problem: Add Binary
Category: String / Math
Difficulty: Easy

Approach:
- Use two pointers starting from the end of both strings
- Add corresponding bits along with carry
- Append (sum % 2) to result
- Update carry as (sum / 2)
- Continue until both strings and carry are exhausted
- Reverse the result at the end

Time Complexity: O(n)
Space Complexity: O(n)
*/

class AddBinary {
    public static void main(String[] args) {

        String a = "1010";
        String b = "1011";

        String result = addBinary(a, b);

        System.out.println("Sum: " + result);
    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}
