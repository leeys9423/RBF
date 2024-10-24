package com.example.constructorAndBuilderPattern;

public class MakeUser {
    public static void main(String[] args) {
        UserVersionDefault user1 = new UserVersionDefault("이영섭", 21, "xxx@gmail.com", "서울시 금천구");
        UserVersionBuilder user2 = new UserVersionBuilder.Builder("이영섭", "xxx@naver.com")
                                                            .age(10)
                                                            .address("충청북도 청주시")
                                                            .build();

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
