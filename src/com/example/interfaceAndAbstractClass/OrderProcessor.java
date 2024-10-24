package com.example.interfaceAndAbstractClass;

// 주문 처리는 공통된 로직이 많으므로 추상 클래스로 정의
public abstract class OrderProcessor {

    // 공통 템플릿 메서드(공통으로 사용하며 Override 할 수 없도록 final 키워드 추가)
    public final OrderResult processOrder(OrderRequest request) {
        // 1. 주문 생성
        Order order = createOrder(request);

        // 2. 재고 확인
        validateStock(order.getItems());

        // 3. 결제 진행
        if (processPayment(request)) {
            // 4. 주문 완료 처리
            OrderResult orderResult = completeOrder(order);

            // 5. 알림 발송
            sendNotification(orderResult);

            return orderResult;
        } else {
            throw new PaymentFailedException("~~이유로 결제에 실패했습니다");
        }


    }

    // 공통 구현
    protected void validateStock(Item[] item) {
        // 재고 확인 공통 로직
    }

    // 하위 클래스에서 반드시 구현해야 하는 메서드(하위 클래스에서만 접근 또는 구현 해야하기 때문에 접근 제어자를 protected 설정
    protected abstract boolean processPayment(OrderRequest request);
    protected abstract Order createOrder(OrderRequest request);
    protected abstract OrderResult completeOrder(Order order);
    protected abstract void sendNotification(OrderResult orderResult);
}
