package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public interface Supplier {
    boolean process(Customer customer, Map<Product, Integer> orderList, int price);
}
