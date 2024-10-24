# 인터페이스와 추상메서드 예시
이커머스 프로젝트에서 사용해볼 수도 있을 법한 예시(가정)
## 인터페이스(Interface)
- 정의 : 일반적으로 `메서드의 선언(바디 없음)`만을 포함하고, 구현은 포함하지 않은 `특수한 클래스`
- 키워드 : 
  1. 공통 부분이 거의 없다.
  2. 전략 패턴(Strategy Pattern) : 객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고, 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하도록 만든 패턴
- 다른 예시 :
  1. 알림 서비스 (SMS, 이메일, 카카오톡, 푸시 등)
  2. 외부 API연동 (다른 택배사 연동)
- 정리 : 
  - 완전히 다른 `구현`이 필요한 경우
  - 구현체 간의 공유할 코드가 거의 없는 경우

## 추상클래스(Abstract Class)
- 정의 : `구현되지 않은 메서드`를 포함하는 클래스
- 키워드 : 
  1. 공통
  2. 템플릿 메서드 패턴 : 여러 클래스에서 공통으로 사용하는 메서드 템플릿화 하여 상위 클래스에서 정의하고, 하위 클래스마다 세부 동작 사항을 다르게 구현하는 패턴
- 다른 예시 :
  1. 할인 정책 적용
- 정리 :
  1. 공통 필드와 메서드가 많은 경우
  2. 기본 구현을 제공하고 싶을 경우
  3. 템플릿 메서드 패턴을 적용하는 경우

## 최종 정리
`인터페이스`는 동일한 사용방법과 동작을 보장하기 위해 사용
`추상클래스`는 클래스의 상속. 즉, 기능을 하여 사용하기 위해 