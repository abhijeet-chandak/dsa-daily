/*
Problem: Island Perimeter
Category: Array / Matrix
Difficulty: Easy

Approach:
- Traverse each cell in the grid
- For every land cell (value = 1):
    → Add 4 to the perimeter
    → If there is a land cell above, subtract 2
    → If there is a land cell to the left, subtract 2
- This avoids double counting shared edges

Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class IslandPerimeter {
    public static void main(String[] args) {

        int[][] grid = {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
        };

        int result = islandPerimeter(grid);

        System.out.println("Island Perimeter: " + result);
    }

    public static int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {

                    perimeter += 4;

                    // Check upper cell
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // Check left cell
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}
