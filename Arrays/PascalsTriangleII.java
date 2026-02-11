/*
Problem: Pascal's Triangle II
Category: Array / Dynamic Programming
Difficulty: Easy

Approach:
- We need to return only one specific row of Pascal’s Triangle
- Start with a list containing [1]
- For each row from 1 to rowIndex:
    → Update values from right to left
    → Each element becomes sum of itself and previous element
- Add 1 at the end of each row

Time Complexity: O(n²)
Space Complexity: O(n)
*/

import java.util.*;

class PascalsTriangleII {
    public static void main(String[] args) {

        int rowIndex = 3;

        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {

            // Update from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }
}
