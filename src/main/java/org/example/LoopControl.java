package org.example;

/**
 * This class shows both correct and incorrect examples of loop usage.
 * It is used to test Checkstyle rules like VariableDeclarationUsageDistance,
 * EmptyBlock, and ModifiedControlVariable.
 */
public class LoopControl {

    /**
     * Task 1: This method calculates the sum of the squares from 1 to 10.
     * This is a correct example. The variable is used right after declared.
     */
    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        return sum;
    }

    /**
     * Task 2: This method prints a triangle made of stars (*).
     * The triangle has 5 lines. This method has no empty blocks.
     */
    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // go to next line
        }
    }


    /**
     * This method shows the correct way to declare and use a variable.
     * The variable is used right after it's created.
     */
    public void correctVariableUsage() {
        int index = 0;
        for (; index < 5; index++) {
            System.out.println("Correct index: " + index);
        }
    }

    /**
     * This method shows an empty block which is not allowed.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                 System.out.println("Not Midpoint at: " + j);
            }
        }
    }

    /**
     * This method changes the loop variable inside the loop body.
     * This is NOT allowed by Checkstyle and it gives an error.
     * I did not fix it because it is meant to show a violation.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // ❌ This is wrong - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }

    /**
     * This method shows a correct loop control usage.
     * I do not change the loop variable inside the loop body.
     */
    public void correctlyModifiedControlVariable() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Looping: " + i);
        }
    }
}
