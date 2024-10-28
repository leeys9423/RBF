package com.example.dataProcessing;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 1. 유연한 비즈니스 로직 구현
public class SalaryCalculator {
    // 보너스 계산 인터페이스 - 전략 패턴 사용
    interface BonusStrategy {
        double calculateBonus(Employee employee);
    }

    // 직무별 보너스 계산 구현
    static class JobBasedBonus implements BonusStrategy {
        @Override
        public double calculateBonus(Employee employee) {
            return switch (employee.getJob()) {
                case "PRESIDENT" -> employee.getSal() * 0.3;
                case "MANAGER" -> employee.getSal() * 0.2;
                default -> employee.getSal() * 0.1;
            };
        }
    }

    // 연차별 보너스 계산 구현
    static class TenureBasedBonus implements BonusStrategy {
        @Override
        public double calculateBonus(Employee employee) {
            long years = ChronoUnit.YEARS.between(employee.getHiredate(), LocalDate.now());
            return employee.getSal() * (years * 0.07);
        }
    }
}
