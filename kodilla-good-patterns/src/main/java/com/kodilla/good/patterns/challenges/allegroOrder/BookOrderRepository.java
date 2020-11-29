package com.kodilla.good.patterns.challenges.allegroOrder;

import java.time.LocalDate;

public class BookOrderRepository implements ProductOrderRepository {
    @Override
    public boolean orderSaveData(User user, Product product, LocalDate orderDate) {
        return true;
    }
}
