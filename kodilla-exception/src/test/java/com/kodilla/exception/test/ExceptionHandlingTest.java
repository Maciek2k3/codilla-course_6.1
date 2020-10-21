package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {
    @Test
    void probablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When&Then
        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(0.9, 1.6);
        });
        assertThrows(Exception.class, () ->
        {
            secondChallenge.probablyIWillThrowException(-5, 1.5);
        });
    }

    @Test
    void happyPatch() throws Exception {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When
        String result = secondChallenge.probablyIWillThrowException(1.2, 1.6);
        //When&Then
        assertEquals("Done!", result);
    }
}

