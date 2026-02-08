/*
Problem: Robot Return to Origin
Category: String / Simulation
Difficulty: Easy

Approach:
- Track robot movement using two variables:
    → vertical position (up/down)
    → horizontal position (left/right)
- Traverse the moves string:
    U → increase vertical position
    D → decrease vertical position
    L → decrease horizontal position
    R → increase horizontal position
- Robot returns to origin if both positions become zero

Time Complexity: O(n)
Space Complexity: O(1)
*/

class RobotReturnToOrigin {
    public static void main(String[] args) {

        String moves = "UD";

        boolean result = judgeCircle(moves);

        System.out.println("Returns to Origin: " + result);
    }

    public static boolean judgeCircle(String moves) {

        int vertical = 0;
        int horizontal = 0;

        for (char move : moves.toCharArray()) {

            if (move == 'U') {
                vertical++;
            }
            else if (move == 'D') {
                vertical--;
            }
            else if (move == 'L') {
                horizontal--;
            }
            else if (move == 'R') {
                horizontal++;
            }
        }

        return vertical == 0 && horizontal == 0;
    }
}
