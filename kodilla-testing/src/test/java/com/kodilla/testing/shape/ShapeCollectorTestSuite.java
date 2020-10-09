package com.kodilla.testing.shape;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test for adding shape")
    @Test
    public void testAddPost() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(4);
        //When
        shapeCollector.addFigures(circle);
        //Then
        assertThat(shapeCollector.getShapes().size()).isEqualTo(1);
    }

    @DisplayName("Test for removing shape")
    @Test
    public void testRemovePost() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(4);
        shapeCollector.addFigures(square);
        //When
        shapeCollector.removeFogure(square);
        //Then
        assertThat(shapeCollector.getShapes()).isEmpty();
    }
    @DisplayName("Test check if list is empty")
    @Test
    public void testIfEmpty() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(4);
        shapeCollector.addFigures(square);
        //When
        shapeCollector.removeFogure(square);
        //Then
        assertThat(shapeCollector.getShapes()).isEmpty();
    }
    @DisplayName("Test for checking number of shape is same")
    @Test
    public void checkShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(4, 2);
        //When
        shapeCollector.addFigures(triangle);
        //Then
        assertThat(triangle).isEqualTo(shapeCollector.getFigure(0));
    }
    @DisplayName("Test for checking list description is same")
    @Test
    public void checkName() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle=new Circle(5);
        shapeCollector.addFigures(circle);
        List<Shape> shapeList=new ArrayList<>();
        //When
        shapeList.add(circle);
        //Then
        assertThat(shapeList.toString()).isEqualTo(shapeCollector.showFigures());
    }
}

