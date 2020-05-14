/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

import com.example.predicates.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParticleDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, 24, "M", "Rashmi", "lunia");
        Employee e2 = new Employee(1, 12, "F", "adarsha", "lunia");
        Employee e3 = new Employee(3, 9, "F", "adarsha", "lunia");
        Employee e4 = new Employee(4, 30, "F", "adarsha", "lunia");
        Employee e5 = new Employee(1, 10, "M", "Nadini", "lunia");

        List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5);

        // employeeList.stream().forEach(System.out::println);


        Predicate<Employee> employeePredicateOne = employee -> employee.getAge() > 12;

        Predicate<Employee> employeePredicateTwo = employee -> employee.getGender().equalsIgnoreCase("F");

        // employeeList.stream().filter(employeePredicateTwo).forEach(System.out::println);

        Function<Employee, String> function = employee -> employee.getFirstName().toUpperCase();

        //   employeeList.stream().map(function).forEach(System.out::println);

        Map<Integer, String> collect = employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getFirstName, (oldValue, newValue) -> oldValue));

        //System.out.println(collect);


        Map<Integer, Long> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
        //System.out.println(collect2);


        List<Employee> collect3 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(collect3);
        System.err.println("====================================");


        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");


        Map<String, Long> collect1 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(collect1);

    }


}
