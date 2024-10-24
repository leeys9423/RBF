package com.example.interfaceAndAbstractClass;

public class OrderResult {
    private final boolean success;
    private final Order order;
    private final String errorMessage;
    private final OrderStatus status;

    // constructor, getters...


    public OrderResult(boolean success, Order order, String errorMessage, OrderStatus status) {
        this.success = success;
        this.order = order;
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public static OrderResult success(Order order) {
        return new OrderResult(true, order, null, OrderStatus.PAYMENT_COMPLETED);
    }

    public static OrderResult fail(String errorMessage, OrderStatus status) {
        return new OrderResult(false, null, errorMessage, status);
    }
}
