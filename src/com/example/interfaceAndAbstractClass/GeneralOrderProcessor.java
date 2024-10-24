package com.example.interfaceAndAbstractClass;

// 일반 주문 처리
public class GeneralOrderProcessor extends OrderProcessor{
    @Override
    protected boolean processPayment(OrderRequest request) {
        // 일반 결제 처리
        return false;
    }

    @Override
    protected Order createOrder(OrderRequest request) {
        // 일반 주문 생성
        return null;
    }

    @Override
    protected OrderResult completeOrder(Order order) {
        // 일반 주문 성공
        return null;
    }

    @Override
    protected void sendNotification(OrderResult orderResult) {
        // 일반 주문 알림
    }
}
