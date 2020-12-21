package com.kodilla.sudoku;

import java.util.Scanner;

public class Matrix {
    public static int[][] matrix = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    public int[][] fillMatrix() {
        for (int y = 0; y <= 9; y++) {
            System.out.println("Give raw number");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Give column number");
            int b = scanner.nextInt();
            System.out.println("Give value number");
            int c = scanner.nextInt();
            matrix[a - 1][b - 1] = c;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
        return matrix;
    }
}
