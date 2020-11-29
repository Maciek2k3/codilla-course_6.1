package com.kodilla.good.patterns.challenges.FoodToDoor;

public class ProductOrderDTO {
    private Customer customer;
    private Product product;
    private int price;
    public boolean isOrdered;

    public ProductOrderDTO(Customer customer, Product product, int price, boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.price = price;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return price;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
