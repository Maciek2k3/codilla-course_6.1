package com.kodilla.good.patterns.challenges.allegroOrder;

import java.time.LocalDate;

public class BookOrderService implements OrderService {

    @Override
    public boolean ordered(User user, Product product, LocalDate orderDate) {
        return true;
    }
}
