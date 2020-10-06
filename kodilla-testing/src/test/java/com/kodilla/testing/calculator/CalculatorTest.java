package com.kodilla.testing.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() {
        Calculator calculator=new Calculator();

        int result=calculator.add(10,15);

        Assert.assertEquals(result,25);
    }

    @Test
    public void testSubstract() {
        Calculator calculator=new Calculator();

        int result=calculator.substract(10,15);

        Assert.assertEquals(result,-5);
    }
}