package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public interface InfoService {
    void information(Supplier supplier, Customer customer, Map<Product, Integer> orderList, int price);
}
