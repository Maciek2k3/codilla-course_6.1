package com.kodilla.good.patterns.allegroOrder;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.orderRequestRetriver();
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new BookOrderService(), new BookOrderRepository());
        productOrderService.process(orderRequest);

    }
}
