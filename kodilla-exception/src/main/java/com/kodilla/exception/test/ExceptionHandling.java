package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.5,1.2);
        } catch (Exception e) {
            System.out.println("Wrong parameters");
            e.printStackTrace();
        } finally {
            System.out.println("Program worked");
        }
    }
}
