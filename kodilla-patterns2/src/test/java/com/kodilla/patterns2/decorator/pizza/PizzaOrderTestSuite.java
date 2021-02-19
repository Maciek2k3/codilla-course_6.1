package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void basicPizzaOrderPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatePrice);
    }

    @Test
    public void basicPizzaOrderName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String orderName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic Pizza", orderName);
    }

    @Test
    public void extraCheeseePizzaOrderPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatePrice);
    }

    @Test
    public void extraCheeseePizzaOrderName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        //When
        String pizzaName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic PizzaExtraCheese", pizzaName);
    }

    @Test
    public void extraGradientPizzaOrderPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraGradientDecorator(pizzaOrder);
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatePrice);
    }

    @Test
    public void extraGradentPizzaOrderName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraGradientDecorator(pizzaOrder);
        //When
        String pizzaName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic PizzaExtraGradient", pizzaName);
    }

    @Test
    public void extraQuickDeliverPizzaOrderPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraQuickDeliver(pizzaOrder);
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatePrice);
    }

    @Test
    public void extraQuickDeliverPizzaOrderName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraQuickDeliver(pizzaOrder);
        //When
        String pizzaName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic PizzaQuickDeliver", pizzaName);
    }

    @Test
    public void extraCheeseGradientPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        pizzaOrder = new ExtraGradientDecorator(pizzaOrder);
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatePrice);
    }

    @Test
    public void extraCheeseGradientName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        pizzaOrder = new ExtraGradientDecorator(pizzaOrder);
        //When
        String pizzaName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic PizzaExtraCheeseExtraGradient", pizzaName);
    }

    @Test
    public void doubleCheesePrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        //When
        BigDecimal calculatePrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatePrice);
    }

    @Test
    public void doubleCheeseGradientName() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseeDecorator(pizzaOrder);
        //When
        String pizzaName = pizzaOrder.getDescription();
        //Then
        assertEquals("Basic PizzaExtraCheeseExtraCheese", pizzaName);
    }
}
