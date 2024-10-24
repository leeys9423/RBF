package com.example.interfaceAndAbstractClass;

public enum OrderStatus {
    // 주문 생성/진행 단계
    PENDING("주문 대기"),
    CREATED("주문 생성됨"),
    PAYMENT_PENDING("결제 대기중"),
    PAYMENT_PROCESSING("결제 진행중"),
    PAYMENT_COMPLETED("결제 완료"),
    PAYMENT_FAILED("결제 실패");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
