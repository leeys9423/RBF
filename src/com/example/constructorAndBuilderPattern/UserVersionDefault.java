package com.example.constructorAndBuilderPattern;

public class UserVersionDefault {

    private final String name;
    private final int age;
    private final String email;
    private final String address;

    public UserVersionDefault(String name, int age, String email, String address) {
        this.name = validateName(name);
        this.age = validateAge(age);
        this.email = validateEmail(email);
        this.address = address;
    }

    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
        return name;
    }

    private int validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("나이가 올바르지 않습니다.");
        }
        return age;
    }

    private String validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("이메일 형식이 올바르지 않습니다.");
        }
        return email;
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
        return "UserVersionDefault{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
