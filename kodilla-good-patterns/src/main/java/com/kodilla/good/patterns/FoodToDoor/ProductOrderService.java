package com.kodilla.good.patterns.FoodToDoor;

public class ProductOrderService {
    private InfoService infoService;
    private Supplier supplier;
    private ProductOrderRepo productOrderRepo;

    public ProductOrderService(InfoService infoService, Supplier supplier, ProductOrderRepo productOrderRepo) {
        this.infoService = infoService;
        this.supplier = supplier;
        this.productOrderRepo = productOrderRepo;
    }

    public ProductOrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = supplier.process(orderRequest.getCustomer(), orderRequest.getProductOrder(), orderRequest.getPrice());
        if (isOrdered) {
            infoService.information(orderRequest.getSupplier(), orderRequest.getCustomer(), orderRequest.getProductOrder(), orderRequest.getPrice());
            supplier.process(orderRequest.getCustomer(), orderRequest.getProductOrder(), orderRequest.getPrice());
            productOrderRepo.orderRepo(orderRequest.getCustomer(), orderRequest.getSupplier(), orderRequest.getProductOrder(), orderRequest.getPrice());
            System.out.println("You booked: " + orderRequest.getProductOrder().entrySet().stream());
            return new ProductOrderDTO(orderRequest.getCustomer(), (Product) orderRequest.getProductOrder(), orderRequest.getPrice(), true);
        } else {
            return new ProductOrderDTO(orderRequest.getCustomer(), (Product) orderRequest.getProductOrder(), orderRequest.getPrice(), false);
        }
    }
}
