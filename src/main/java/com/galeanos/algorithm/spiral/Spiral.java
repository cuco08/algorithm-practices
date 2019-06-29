package com.galeanos.algorithm.spiral;

public class Spiral {

    public int[][] calcMatrix(int n, int initialValue) {
        validMatrixSize(n);

    if (validMatrixSize(n)) {
        int matrix[][] = new int[n][n];
        int matrixSize = n;

        for (int k = 0; k < (n + 1) / 2; k++) {
            int i = k, j;

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
            for (i = matrixSize - 2; i >= k + 1; --i) {
                matrix[i][j] = initialValue++;
            }

            matrixSize -= 1;
        }

        return matrix;
    }else{
        int matrix[][] = new int[1][1];
        matrix[0][0] = 0;
        return matrix;
    }

       // return matrix;
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
        int matrix[][] = spiral.calcMatrix(5, -50);
        spiral.printMatrix(matrix);
    }

    private boolean validMatrixSize(int n){
        boolean validMatrix= true;
        if (n < 1 || n > 200){
            //System.out.println("Invalid Value");
             validMatrix = false;
        }
        return validMatrix;

    }
}
