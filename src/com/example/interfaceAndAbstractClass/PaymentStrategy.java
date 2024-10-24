package com.example.interfaceAndAbstractClass;

// 결제 방식은 완전히 다른 구현을 가질 것이므로 인터페이스로 정의
public interface PaymentStrategy {

    boolean pay(int amount);
    boolean cancelPayment(String orderId);
    PaymentType getPaymentType();
}
