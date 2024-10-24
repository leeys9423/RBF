package com.example.interfaceAndAbstractClass;

// 구독 주문 처리
public class SubscriptionOrderProcessor extends OrderProcessor{
    @Override
    protected boolean processPayment(OrderRequest request) {
        // 구독 결제 처리
        return false;
    }

    @Override
    protected Order createOrder(OrderRequest request) {
        // 구독 주문 생성
        return null;
    }

    @Override
    protected OrderResult completeOrder(Order order) {
        // 구독 주문 완료
        return null;
    }

    @Override
    protected void sendNotification(OrderResult orderResult) {
        // 구독 주문 알림
    }
}
