public class DiagonalMatrixSum {
    public static void main(String[] args) {
        // Creating a 10x10 two-dimensional array
        int[][] matrix = new int[10][10];

        // Filling the matrix with numbers based on diagonal and non-diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    // Diagonal elements: 0 to 9
                    matrix[i][j] = i % 10;
                } else {
                    // Non-diagonal elements: 0
                    matrix[i][j] = 0;
                }
            }
        }

        // Calculating the sum of diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        // Printing the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Printing the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }
}
