package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowaniaa");
        Calculator calc1 = new Calculator();

        System.out.println("Add test");
        if (calc1.add(4,5)==9){
            System.out.println("Test OK");
        }else {
            System.out.println("Test NOK");
        }
        System.out.println("Substract test");
        if (calc1.substract(5,4)==1){
            System.out.println("Test OK");
        }else {
            System.out.println("Test NOK");
        }
    }
}

