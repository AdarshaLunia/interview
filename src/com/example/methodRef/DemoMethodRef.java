/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.methodRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoMethodRef {
    // we can refer a method from class or object using class::methodName type syntax.
    public static void main(String a[]) {
        List<Integer> integers = Arrays.asList(1, 12, 433, 5);

        // Method reference to static method – Class::staticMethodName
        Optional<Integer> maxNum = integers.stream().reduce(Math::max);
        maxNum.ifPresent(value -> System.out.println(value));

        //Method reference to instance method from instance – ClassInstance::instanceMethodName
        /* In above example, we use System.out.println(value) to print the max value found.
            We can use System.out::println to print the value.*/
        maxNum.ifPresent(System.out::println);

        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sorted = strings
                .stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sorted);
        // Method reference to instance method from class type – Class::instanceMethodName
        // In this example, s1.compareTo(s2) is referred as String::compareTo.

        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println(sortedAlt);

        //Reference to constructor – Class::new
       /*
        The first method can be updated to create a list of integers from 1 to 100.
        Using lambda expression is rather easy. To create a new instance of ArrayList,
        we have use ArrayList::new.
       */
        List<Integer> integerss = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Optional<Integer> max = integerss.stream().reduce(Math::max);
        max.ifPresent(System.out::println);

    }
}
