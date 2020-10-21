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
        // int gameComputer;
        List<Integer> userResult = new ArrayList<>();
        List<Integer> compResult = new ArrayList<>();
        ComputerRunner computerRunner = new ComputerRunner();
       // int gameComputer = 0;


        while (!end) {
            int gameComputer = 0;
            userResult.clear();
            compResult.clear();
            System.out.println("Type your name");
            String name = scanner.nextLine();
            System.out.println("Type how many round is played ");
            String choose = scanner.nextLine();
            int howManyNumber = Integer.parseInt(choose);
            System.out.println("your name is: " + name + "," + "You play round: " + howManyNumber);
            printMenu();

            for (int i = 0; i < howManyNumber; i++) {
                System.out.println("Round: " + (i + 1));
                System.out.println("Type your choice");
                String gameNumber = scanner.nextLine();
                int choseNumber = Integer.parseInt(gameNumber);
                //gameComputer = random.nextInt(3) + 1;
                if (choseNumber == 1 || choseNumber == 2 || choseNumber == 3 || choseNumber == 4 || choseNumber == 5) {
                    if (choseNumber == 1) {
                        System.out.println("Your Choice: rocket");
                        gameComputer = computerRunner.userRocket();
                    } else if (choseNumber == 2) {
                        System.out.println("Your Choice: paper");
                        gameComputer = computerRunner.userPaper();
                    } else if (choseNumber == 3) {
                        System.out.println("Your choice: scissors");
                        gameComputer = computerRunner.userScissors();
                    } else if (choseNumber == 4) {
                        System.out.println("Your choice: blizzard");
                        gameComputer = computerRunner.userBlizzard();
                    } else if (choseNumber == 5) {
                        System.out.println("Your choice: spock");
                        gameComputer = computerRunner.userSpock();
                    }
                    if (gameComputer == 1) {
                        System.out.println("Computer: rocket");
                        if (choseNumber == 3) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 2) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 1) {
                            System.out.println("Semi");
                        } else if (choseNumber == 4) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        }
                    } else if (gameComputer == 2) {
                        System.out.println("Computer: paper");

                        if (choseNumber == 1) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 2) {
                            System.out.println("Semi");
                        } else if (choseNumber == 1) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 3) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 4) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        }

                    } else if (gameComputer == 3) {
                        System.out.println("Computer: scissors");

                        if (choseNumber == 2) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 1) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 3) {
                            System.out.println("Semi");
                        } else if (choseNumber == 4) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        }
                    } else if (gameComputer == 4) {
                        System.out.println("Computer: blizzard");
                        if (choseNumber == 2) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 1) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 3) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 4) {
                            System.out.println("Semi");
                        } else {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        }
                    } else if (gameComputer == 5) {
                        System.out.println("Computer: Spock");
                        if (choseNumber == 2) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else if (choseNumber == 1) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 3) {
                            System.out.println("Computer Wins");
                            compResult.add(1);
                        } else if (choseNumber == 4) {
                            System.out.println(name + "Wins");
                            userResult.add(1);
                        } else {
                            System.out.println("Semi");
                        }
                    } else {
                        System.out.println("Wrong number, try value from the range");
                        break;
                    }
                    System.out.println("Round: " + (i + 1) + ":" + "Computer result: " + compResult.size() + ", " + name + " result: " + userResult.size());
                }
                System.out.println("Final result: " + "Computer result: " + compResult.size() + ", " + name + " result: " + userResult.size());
                System.out.println("Type x- to end, n-once again");

            }
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

    private static void printMenu() {
        System.out.println("Rules for game:");
        System.out.println("1-rocket");
        System.out.println("2-paper");
        System.out.println("3-scissors");
        System.out.println("4-blizzard");
        System.out.println("5-spock");
        System.out.println("x-end");
        System.out.println("n-once Again");
    }
}

