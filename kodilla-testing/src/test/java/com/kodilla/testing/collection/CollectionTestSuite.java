package com.kodilla.testing.collection;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("when create empty List, " +
            "then list should return true")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator emptyExaminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> exam = emptyExaminator.exterminate(emptyList);
        //Then
        assertThat(exam).isEmpty();
    }
    @DisplayName("when create list with odd and even number, " +
            "then list should return only even numbers, plus even List size with only even numbers")
    @Test
    public void oddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator=new OddNumbersExterminator();
        List<Integer> evenList=Arrays.asList(4,5,7,9);
        //When
        List<Integer> examEven=oddNumbersExterminator.exterminate(evenList);
        //Then
        assertThat(examEven).containsExactly(4);
        assertThat(examEven.size()).isEqualTo(1);
    }
}
