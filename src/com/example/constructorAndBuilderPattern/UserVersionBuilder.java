package com.example.constructorAndBuilderPattern;

public class UserVersionBuilder {

    private final String name;
    private final int age;
    private final String email;
    private final String address;

    private UserVersionBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class Builder {
        // 필수 매개변수(name, email)
        private String name;
        private int age;
        private String email;
        private String address;

        // 필수 매개변수만을 가진 빌더 생성자
        public Builder(String name, String email) {
            this.name = name;
            if (!email.contains("@")) {
                throw new IllegalArgumentException("이메일 형식이 맞지 않습니다.");
            }
            this.email = email;
        }

        public Builder age(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("나이가 올바르지 않습니다.");
            }
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public UserVersionBuilder build() {
            // 필수 필드 검증
            if (name == null || email == null) {
                throw new IllegalStateException("이름과 이메일은 필수입니다.");
            }
            return new UserVersionBuilder(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserVersionBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
