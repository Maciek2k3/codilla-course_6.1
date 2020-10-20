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
            rocket.add(5);
        }
        for (int a = 0; a < 25; a++) {
            rocket.add(3);
            rocket.add(4);
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
            paper.add(1);
            paper.add(5);
        }
        for (int b = 0; b < 50; b++) {
            paper.add(3);
            paper.add(4);
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
            scissors.add(1);
            scissors.add(5);
        }
        for (int b = 0; b < 25; b++) {
            scissors.add(3);
            scissors.add(4);
        }
        int userScissors = random.nextInt(100);
        return scissors.get(userScissors);
    }

    public int userBlizzard() {
        List<Integer> blizzard = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            blizzard.add(2);
        }
        for (int a = 0; a < 50; a++) {
            blizzard.add(3);
            blizzard.add(1);
        }
        for (int b = 0; b < 25; b++) {
            blizzard.add(4);
            blizzard.add(5);
        }
        int userBlizzard = random.nextInt(100);
        return blizzard.get(userBlizzard);

    }

    public int userSpock() {
        List<Integer> spock = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            spock.add(1);
        }
        for (int a = 0; a < 50; a++) {
            spock.add(4);
            spock.add(2);
        }
        for (int b = 0; b < 25; b++) {
            spock.add(3);
            spock.add(5);
        }
        int userSpock = random.nextInt(100);
        return spock.get(userSpock);
    }
}

