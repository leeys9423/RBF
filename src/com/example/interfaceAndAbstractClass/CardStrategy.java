package com.example.interfaceAndAbstractClass;

public class CardStrategy implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        // 카드 결제 로직
        return false;
    }

    @Override
    public boolean cancelPayment(String orderId) {
        // 카드 결제 취소 로직
        return false;
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CARD;
    }
}
