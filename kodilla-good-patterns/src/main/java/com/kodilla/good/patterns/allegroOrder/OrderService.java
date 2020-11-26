package com.kodilla.good.patterns.allegroOrder;

import java.time.LocalDate;

public interface OrderService {
    boolean ordered(User user, Product product, LocalDate orderDate);

}
