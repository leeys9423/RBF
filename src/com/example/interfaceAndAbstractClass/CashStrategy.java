package com.example.interfaceAndAbstractClass;

public class CashStrategy implements PaymentStrategy{
    @Override
    public boolean pay(int amount) {
        // 현금 결제 로직
        return false;
    }

    @Override
    public boolean cancelPayment(String orderId) {
        // 현금 결제 취소 로직
        return false;
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CASH;
    }
}
