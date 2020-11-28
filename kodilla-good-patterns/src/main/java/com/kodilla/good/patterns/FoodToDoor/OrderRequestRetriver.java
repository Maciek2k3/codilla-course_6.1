package com.kodilla.good.patterns.FoodToDoor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriver {


    public OrderRequest orderRequestRetriver() {
        Customer customer = new Customer("Maciek", "Maciek", 32);
        Supplier supplier = new HealthyShop();
        Product product=new Fruit("Fruit",2);
        Product product1=new Meat("Meat",4);
        Map<Product,Integer> listOrder=new HashMap<>();
        listOrder.put(product1, product.getPrice());
        listOrder.put(product,product.getPrice());
        int totalPrice=listOrder.values().stream().mapToInt(Integer::valueOf).sum();
        return new OrderRequest(customer, supplier,totalPrice, listOrder);
    }
}
