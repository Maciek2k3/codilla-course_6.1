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
    String va=" ";
    String vb=" ";
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
                    if ((i+1)%3==0){
                        va="-";
                    }else {
                        va=" ";
                    }
                    if ((j+1)%3==0){
                        vb="|";
                    }else {
                        vb=" ";
                    }
                    System.out.print(matrix[i][j]);
                    System.out.print(vb);

                }
                System.out.println();
                for (int k=0;k<18;k++){
                    System.out.print(va);
                }
                System.out.println();
            }
        }
        return matrix;
    }
}

