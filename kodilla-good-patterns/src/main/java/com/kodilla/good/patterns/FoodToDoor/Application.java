package com.kodilla.good.patterns.FoodToDoor;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.orderRequestRetriver();
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ExtraFoodShop(), new OrderRepository());
        productOrderService.process(orderRequest);
    }
}
