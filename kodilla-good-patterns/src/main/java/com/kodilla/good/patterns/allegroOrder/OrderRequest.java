package com.kodilla.good.patterns.allegroOrder;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDate orderDate;

    public OrderRequest(final User user,final Product product, final LocalDate orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
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
}
