package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerRunner {
    Random random = new Random();

    public int userRocket() {
        List<Integer> rocket = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            rocket.add(2);
        }
        for (int a = 0; a < 25; a++) {
            rocket.add(3);
        }
        for (int b = 0; b < 25; b++) {
            rocket.add(1);
        }
        int userRocket = random.nextInt(100);
        return rocket.get(userRocket);
    }

    public int userPaper() {
        List<Integer> paper = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            paper.add(2);
        }
        for (int a = 0; a < 25; a++) {
            paper.add(3);
        }
        for (int b = 0; b < 50; b++) {
            paper.add(1);
        }
        int userPaper = random.nextInt(100);
        return paper.get(userPaper);
    }

    public int userScissors() {
        List<Integer> scissors = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            scissors.add(2);
        }
        for (int a = 0; a < 50; a++) {
            scissors.add(3);
        }
        for (int b = 0; b < 25; b++) {
            scissors.add(1);
        }
        int userScissors = random.nextInt(100);
        return scissors.get(userScissors);

    }

}

