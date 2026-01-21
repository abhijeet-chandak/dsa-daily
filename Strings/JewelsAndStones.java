/*
Problem: Jewels and Stones
Category: String / Hashing
Difficulty: Easy

Approach:
- Use a boolean array to mark all jewel characters
- Traverse the jewels string and mark each character as a jewel
- Traverse the stones string and count characters marked as jewels
- Return the final count

Time Complexity: O(n + m)
Space Complexity: O(1)   // fixed-size array
*/

class JewelsAndStones {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = numJewelsInStones(jewels, stones);

        System.out.println("Number of Jewels in Stones: " + result);
    }

    public static int numJewelsInStones(String jewels, String stones) {

        boolean[] isJewel = new boolean[128];

        // Mark jewel characters
        for (int i = 0; i < jewels.length(); i++) {
            isJewel[jewels.charAt(i)] = true;
        }

        int count = 0;

        // Count stones that are jewels
        for (int i = 0; i < stones.length(); i++) {
            if (isJewel[stones.charAt(i)]) {
                count++;
            }
        }

        return count;
    }
}
