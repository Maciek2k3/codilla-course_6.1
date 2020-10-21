package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionHandlingTest {
    @Test
    void probablyIWillThrowException(){
        //Given
        SecondChallenge secondChallenge=new SecondChallenge();
        //When&Then
        assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(2,1.4));
        assertThrows(Exception.class,()->secondChallenge.probablyIWillThrowException(0.9,1.6));
        }

    }

