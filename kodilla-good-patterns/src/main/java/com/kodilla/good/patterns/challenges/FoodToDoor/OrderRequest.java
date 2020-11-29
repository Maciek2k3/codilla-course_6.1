package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private Supplier supplier;
    private int Price;
    private Map<Product, Integer> productOrder;

    public OrderRequest(Customer customer, Supplier supplier, int price, Map<Product, Integer> productOrder) {
        this.customer = customer;
        this.supplier = supplier;
        Price = price;
        this.productOrder = productOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getPrice() {
        return Price;
    }

    public Map<Product, Integer> getProductOrder() {
        return productOrder;
    }
}
