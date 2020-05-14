/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupAndCountDemo {

    public static void main(String a[]) {
        List<String> person =
                Arrays.asList("John", "Adarsha", "John", "jennie", "jennie");
        final Map<String, Long> counting = person.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        ); // Group by each element in list that's why intruduced "Function.identity()"
        counting.forEach((name, count) -> System.out.println(name + "=>" + count));

    }
}
