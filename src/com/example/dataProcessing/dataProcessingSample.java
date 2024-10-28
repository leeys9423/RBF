package com.example.dataProcessing;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class dataProcessingSample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(7369, "SMITH", "CLERK", 7902, LocalDate.parse("2010-12-17"), 800.00, null, 20),
                new Employee(7499, "ALLEN", "SALESMAN", 7698, LocalDate.parse("2011-02-20"), 1600.00, 300.00, 30),
                new Employee(7521, "WARD", "SALESMAN", 7698, LocalDate.parse("2011-02-22"), 1250.00, 500.00, 30),
                new Employee(7566, "JONES", "MANAGER", 7839, LocalDate.parse("2011-04-02"), 2975.00, null, 20),
                new Employee(7654, "MARTIN", "SALESMAN", 7698, LocalDate.parse("2011-09-28"), 1250.00, 1400.00, 30),
                new Employee(7698, "BLAKE", "MANAGER", 7839, LocalDate.parse("2011-05-01"), 2850.00, null, 30),
                new Employee(7782, "CLARK", "MANAGER", 7839, LocalDate.parse("2011-06-09"), 2450.00, null, 10),
                new Employee(7788, "SCOTT", "ANALYST", 7566, LocalDate.parse("2017-07-13"), 3000.00, null, 20),
                new Employee(7839, "KING", "PRESIDENT", null, LocalDate.parse("2011-11-17"), 5000.00, null, 10),
                new Employee(7844, "TURNER", "SALESMAN", 7698, LocalDate.parse("2011-09-08"), 1500.00, 0.00, 30),
                new Employee(7876, "ADAMS", "CLERK", 7788, LocalDate.parse("2017-07-13"), 1100.00, null, 20),
                new Employee(7900, "JAMES", "CLERK", 7698, LocalDate.parse("2011-12-03"), 950.00, null, 30),
                new Employee(7902, "FORD", "ANALYST", 7566, LocalDate.parse("2011-12-03"), 3000.00, null, 20),
                new Employee(7934, "MILLER", "CLERK", 7782, LocalDate.parse("2012-01-23"), 1300.00, null, 10)
        );

        // 가독성 높은 코드
        // 월급이 1500 이상인 근로자들 이름
        List<String> employeeNamesAbove1500 = employees.stream().filter(employee -> employee.getSal() > 1500).map(Employee::getEname).toList();
        // deptno 가 20인 근로자들
        List<Employee> employeesInDeptno20 = employees.stream().filter(employee -> employee.getDeptno() == 20).toList();
    }
}
