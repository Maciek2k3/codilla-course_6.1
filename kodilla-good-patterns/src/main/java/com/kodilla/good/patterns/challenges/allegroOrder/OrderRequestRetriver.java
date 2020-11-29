package com.kodilla.good.patterns.challenges.allegroOrder;

import java.time.LocalDate;

public class OrderRequestRetriver {
    public OrderRequest orderRequestRetriver() {
        User user1 = new User("Maciek", "Maciek", 22);
        LocalDate orderDate = LocalDate.of(2020, 11, 23);
        Book book1 = new Book("King", 23);
        return new OrderRequest(user1, book1, orderDate);
    }
}
