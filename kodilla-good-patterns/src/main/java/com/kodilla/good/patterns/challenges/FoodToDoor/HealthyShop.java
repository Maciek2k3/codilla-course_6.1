package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public class HealthyShop implements Supplier{
    @Override
    public boolean process(Customer customer, Map<Product, Integer> orderList, int price) {
        return false;
    }
}
