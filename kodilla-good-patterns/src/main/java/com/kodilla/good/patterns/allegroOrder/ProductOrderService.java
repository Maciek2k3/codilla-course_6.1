package com.kodilla.good.patterns.allegroOrder;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.ordered(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            productOrderRepository.orderSaveData(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate());
            return new ProductOrderDTO(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate(), true);
        } else {
            return new ProductOrderDTO(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderDate(), false);
        }
    }
}
