package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public class MailService implements InfoService {
    @Override
    public void information(Supplier supplier, Customer customer, Map<Product, Integer> orderList, int price) {
        System.out.println("Hello"+customer.getName()+"ordered from: "+supplier+"yourOrder"+orderList.entrySet());

    }
}
