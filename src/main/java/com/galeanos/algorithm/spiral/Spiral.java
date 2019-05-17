package com.galeanos.algorithm.spiral;

public class Spiral {
    public int[][] calcMatrix(int n, int initialValue) {
        int matrix[][] = new int[n][n];
        int matrixSize = n;

        for (int k=0; k<(n+1)/2; k++) {
            int i=k, j;

            for (j = k; j < matrixSize; ++j) {
                matrix[i][j] = initialValue++;
            }

            j = matrixSize - 1;
            for (i = i + 1; i < matrixSize; ++i) {
                matrix[i][j] = initialValue++;
            }

            i = matrixSize - 1;
            for (j = matrixSize - 2; j >= k; --j) {
                matrix[i][j] = initialValue++;
            }

            j = k;
            for (i = matrixSize - 2; i >= k+1; --i) {
                matrix[i][j] = initialValue++;
            }

            matrixSize -= 1;
        }

        return matrix;
    }

    public void printMatrix(int matrix[][]) {
        for (int i=0; i<matrix.length; ++i) {
            for (int j=0; j<matrix.length; ++j) {
                System.out.print(matrix[i][j] + ",\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String []args) {
        Spiral spiral = new Spiral();
        int matrix[][] = spiral.calcMatrix(10, 100);
        spiral.printMatrix(matrix);
    }
}
