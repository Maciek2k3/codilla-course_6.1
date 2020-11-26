package com.kodilla.good.patterns.allegroOrder;

import java.time.LocalDate;

public class ProductOrderDTO {
    private User user;
    private Product product;
    private LocalDate orderDate;
    public boolean isOrdered;

    public ProductOrderDTO(User user, Product product, LocalDate orderDate, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {
        return orderDate;

    }

    public boolean isOrdered() {
        return isOrdered;
    }
}

