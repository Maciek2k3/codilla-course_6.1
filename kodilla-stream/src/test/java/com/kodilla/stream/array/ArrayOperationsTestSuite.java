package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 3, 4, 5, 6};
        //When
        double avarange = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(4.0, avarange, 0.001);
    }
}
