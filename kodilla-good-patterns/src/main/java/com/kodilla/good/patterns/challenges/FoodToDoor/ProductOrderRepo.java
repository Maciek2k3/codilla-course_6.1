package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public interface ProductOrderRepo {
    boolean orderRepo(Customer customer, Supplier supplier, Map<Product, Integer> product, int quantity);
}
