package com.kodilla.good.patterns.FoodToDoor;

import java.util.Map;

public class GlutenFreeShop implements Supplier{
    @Override
    public boolean process(Customer customer, Map<Product, Integer> orderList, int price) {
        return false;
    }
}
