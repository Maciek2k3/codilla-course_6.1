package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public class OrderRepository implements ProductOrderRepo {
    @Override
    public boolean orderRepo(Customer customer, Supplier supplier, Map<Product, Integer> product, int quantity) {
        return true;
    }
}
