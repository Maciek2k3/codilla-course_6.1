package com.kodilla.sudoku;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            Matrix matrix = new Matrix();
            SudokuGame theGame = new SudokuGame(matrix.fillMatrix());
            theGame.game();
            if (theGame.backTrack()) {
                System.out.println("Simple");
                theGame.game();
            } else {
                System.out.println("no to solve");
            }
            System.out.println("do you want to play again: Y/N");
            Scanner scanner=new Scanner(System.in);
            String question=scanner.nextLine();
            if (question=="Y"){
                gameFinished=false;
            }else {
                gameFinished=true;
            }

        }
    }
}
