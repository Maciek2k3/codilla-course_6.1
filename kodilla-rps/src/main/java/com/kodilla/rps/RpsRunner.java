package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean end = false;
        int gameComputer;
        List<Integer> userResult = new ArrayList<>();
        List<Integer> compResult = new ArrayList<>();


        while (!end) {
            System.out.println("Type your name");
            String name = scanner.nextLine();
            System.out.println("Type how many round is played ");
            String choose = scanner.nextLine();
            int howManyNumber = Integer.parseInt(choose);
            System.out.println("your name is: " + name + "," + "You play round: " + howManyNumber);
            System.out.println("Rules for game:");
            System.out.println("1-rocket");
            System.out.println("2-paper");
            System.out.println("3-scissors");
            System.out.println("x-end");
            System.out.println("n-once Again");

            for (int i = 0; i < howManyNumber; i++) {
                System.out.println("Round: " + (i + 1));
                System.out.println("Type your choice");
                String gameNumber = scanner.nextLine();
                int choseNumber = Integer.parseInt(gameNumber);
                gameComputer = random.nextInt(4) + 1;
                if (choseNumber == 1 || choseNumber == 2 || choseNumber == 3) {
                    if (choseNumber == 1) {
                        System.out.println("Your Choice: rocket");
                    } else if (choseNumber == 2) {
                        System.out.println("Your Choice: paper");
                    } else {
                        System.out.println("Your choice: scissors");
                    }

                    if (gameComputer == 1) {
                        System.out.println("Computer: rocket");

                        if (choseNumber == 3) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 2) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else {
                            System.out.println("Semi");
                        }
                    } else if (gameComputer == 2) {
                        System.out.println("Computer: paper");

                        if (choseNumber == 1) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 2) {
                            System.out.println("Semi");
                        } else {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        }

                    } else {
                        System.out.println("Computer: scissors");

                        if (choseNumber == 2) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 1) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else {
                            System.out.println("Semi");
                        }
                    }
                } else {
                    System.out.println("Wrong number, try value from the range");
                    break;
                }
                System.out.println("Round: " + (i + 1) + ":" + "Computer result: " + compResult.size() + ", " + name + " result: " + userResult.size());
            }
            System.out.println("Final result: " + "Computer result: " + compResult.size() + ", " + name + " result: " + userResult.size());
            System.out.println("Type x- to end, n-once again");


            Scanner scan = new Scanner(System.in);
            String game = scan.nextLine();
            if (game.equals("x")) {
                System.out.println("Are you sure: type x ");
                String gameClose = scan.nextLine();
                if (gameClose.equals("x")) {
                    end = true;
                } else
                    System.out.println(("Wrong choice"));
            } else if (game.equals("n")) {
                end = false;
            } else {
                System.out.println("Wrong choice");
            }
        }
    }
}
