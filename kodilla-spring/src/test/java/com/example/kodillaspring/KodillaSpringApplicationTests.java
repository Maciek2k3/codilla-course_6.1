package com.example.kodillaspring;

import com.example.kodillaspring.shape.Circle;
import com.example.kodillaspring.shape.Shape;
import com.example.kodillaspring.shape.Square;
import com.example.kodillaspring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {
    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kodillaspring");

        Shape shape = (Shape)context.getBean("circle");

        //When
        String name = shape.getName();

        //Then
        assertEquals("This is a Circle", name);
    }


    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Shape shape = (Shape) context.getBean("triangle");

        //When
        String name = shape.getName();

        //Then
        assertEquals("This is a Triangle", name);
    }
    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Shape shape = (Shape) context.getBean("createSquare");
        //When
        String name = shape.getName();
        //Then
        assertEquals("This is a square", name);
    }
    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Shape shape = (Shape)context.getBean("choosenShape");

        //When
        String name = shape.getName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }

    @Test
    void contextLoads() {
    }

}
