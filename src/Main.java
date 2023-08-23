import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int rows = scanner.nextInt();    // Number of rows
        int columns = scanner.nextInt(); // Number of columns
        int treeNumber = scanner.nextInt(); // Tree number

        // Check if the tree is a mango tree
        boolean isMangoTree = isMangoTree(rows, columns, treeNumber);

        // Print the result
        System.out.println(isMangoTree);

        // Close the scanner
        scanner.close();
    }

    static boolean isMangoTree(int rows, int columns, int treeNumber) {
        // Check if the tree is in the first row, first column, or last column
        boolean isFirstRow = treeNumber <= columns;
        boolean isFirstColumn = treeNumber % columns == 1;
        boolean isLastColumn = treeNumber % columns == 0;

        return isFirstRow || isFirstColumn || isLastColumn;
    }
}
