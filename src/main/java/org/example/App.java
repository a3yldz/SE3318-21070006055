package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();

        System.out.println("\nDemonstrating incorrect variable usage:");
        ExampleUsage exampleUsage = new ExampleUsage();
        exampleUsage.incorrectVariableUsage();

        // Task 1 - Sum of squares
        System.out.println("\nTask 1: Sum of squares from 1 to 10:");
        int squaresSum = loopControl.sumOfSquares();
        System.out.println("Sum of squares: " + squaresSum);

        // Task 2 - Triangle printing
        System.out.println("\nTask 2: Printing triangle of asterisks:");
        loopControl.printTriangle();

        // Demonstrating empty block usage
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modified control variable
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.correctlyModifiedControlVariable();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable();

        // Using ExampleUsage class to show practical uses of loops
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Task 4 - Count even numbers
        System.out.println("\nTask 4: Counting even numbers from 1 to 20:");
        int evenCount = exampleUsage.filterAndCountEvenNumbers();
        System.out.println("Total even numbers: " + evenCount);

        // Task 5 - Matrix diagonal sum
        System.out.println("\nTask 5: Matrix diagonal sum:");
        int diagSum = exampleUsage.matrixDiagonalSum();
        System.out.println("Diagonal sum: " + diagSum);

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
