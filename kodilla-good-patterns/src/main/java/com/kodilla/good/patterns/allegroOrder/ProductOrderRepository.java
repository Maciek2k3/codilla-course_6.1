package com.kodilla.good.patterns.allegroOrder;

import java.time.LocalDate;

public interface ProductOrderRepository {
    boolean orderSaveData(User user, Product product, LocalDate orderDate);
}
