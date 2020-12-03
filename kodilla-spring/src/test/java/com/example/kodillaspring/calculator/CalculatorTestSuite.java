package com.example.kodillaspring.calculator;

import com.example.kodillaspring.library.Library;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void addTest() {
        //given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.example.kodillaspring");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //when
        double adding = calculator.add(4, 5);
        double minus = calculator.minus(4, 5);
        double multi = calculator.multiple(4, 5);
        double devide = calculator.devide(4, 4);
        //then
        Assert.assertEquals(adding, 9, 0.001);
        Assert.assertEquals(minus, -1, 0.001);
        Assert.assertEquals(multi, 20, 0.001);
        Assert.assertEquals(devide, 1, 0.001);
    }
}
