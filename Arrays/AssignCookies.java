/*
Problem: Assign Cookies
Category: Greedy
Difficulty: Easy

Approach:
- Each child has a greed factor g[i]
- Each cookie has a size s[j]
- A child is content if cookie size ≥ greed factor
- To maximize content children:
    → sort both arrays
    → use two pointers
- Assign the smallest possible cookie that satisfies a child
- Move to the next child once satisfied

Time Complexity: O(n log n + m log m)
Space Complexity: O(1)
*/

import java.util.Arrays;

class AssignCookies {
    public static void main(String[] args) {

        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        int result = findContentChildren(g, s);

        System.out.println("Content Children: " + result);
    }

    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {

            if (s[cookie] >= g[child]) {
                child++;   // child satisfied
            }

            cookie++;      // move to next cookie
        }

        return child;
    }
}
