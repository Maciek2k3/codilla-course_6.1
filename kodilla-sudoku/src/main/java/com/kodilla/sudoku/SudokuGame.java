package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private int[][] board;
    public static int EMPTY = 0;
    public static int SIZE = 9;

    public SudokuGame(int[][] board) {
        this.board = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.board[i][j] = board[i][j];
            }
        }
    }

    private boolean rowTrue(int row, int value) {
        for (int i = 0; i < SIZE; i++)
            if (board[row][i] == value)
                return true;
        return false;
    }

    private boolean colTrue(int col, int value) {
        for (int i = 0; i < SIZE; i++)
            if (board[i][col] == value)
                return true;
        return false;
    }

    private boolean treeTrue(int row, int col, int value) {
        int ro = row - row % 3;
        int co = col - col % 3;

        for (int i = ro; i < ro; i++)
            for (int j = co; j < co; j++)
                if (board[i][j] == value)
                    return true;
        return false;
    }

    private boolean ok(int row, int col, int value) {
        return !rowTrue(row, value) && !colTrue(col, value) && !treeTrue(row, col, value);
    }

    public boolean backTrack() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    for (int value = 1; value <= SIZE; value++) {
                        if (ok(row, col, value)) {
                            board[row][col] = value;
                            if (backTrack()) {
                                return true;
                            } else {
                                board[row][col] = EMPTY;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void game() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("" + board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}





