/*
Problem: Pascal's Triangle
Category: Array / Dynamic Programming
Difficulty: Easy

Approach:
- Create a list of lists to store rows of Pascal’s Triangle
- The first and last element of every row is always 1
- Each inner element is the sum of the two elements above it:
    triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]
- Build rows one by one up to numRows

Time Complexity: O(n²)
Space Complexity: O(n²)
*/

import java.util.*;

class PascalsTriangle {
    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> triangle = generate(numRows);

        System.out.println(triangle);
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // first and last element are always 1
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(
                        triangle.get(i - 1).get(j - 1)
                        + triangle.get(i - 1).get(j)
                    );
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
