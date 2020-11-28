package com.kodilla.good.patterns.FoodToDoor;

public abstract class Product {
    String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;

    }

    public int getPrice() {
        return price;
    }
}
