package basicjava;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        // Fill the matrix with input values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int row = 0, col = 0;
        int remainingRows = n, remainingCols = n;

        while (remainingRows > 0 && remainingCols > 0) {
            // Traverse right
            for (int i = 0; i < remainingCols; i++) {
                System.out.print(matrix[row][col] + " ");
                col++;
            }
            col--;
            row++;
            remainingRows--;

            // Traverse down
            for (int i = 0; i < remainingRows; i++) {
                System.out.print(matrix[row][col] + " ");
                row++;
            }
            row--;
            col--;
            remainingCols--;

            // Traverse left
            if (remainingRows > 0) {
                for (int i = 0; i < remainingCols; i++) {
                    System.out.print(matrix[row][col] + " ");
                    col--;
                }
                col++;
                row--;
                remainingRows--;
            }

            // Traverse up
            if (remainingCols > 0) {
                for (int i = 0; i < remainingRows; i++) {
                    System.out.print(matrix[row][col] + " ");
                    row--;
                }
                row++;
                col++;
                remainingCols--;
            }
        }
    }
}
