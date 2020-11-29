package com.kodilla.good.patterns.challenges.allegroOrder;

abstract class Product {
    private String productName;
    private float price;

    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }
}
