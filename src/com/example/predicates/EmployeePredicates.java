package com.example.predicates;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAgeMoreThan(Integer a) {
        return employee -> employee.getAge() > a;
    }

    public static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> predicateEmp) {
        return employees.stream().filter(predicateEmp).collect(Collectors.toList());
    }

}
