/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMappingDemoOne {
    public static void main(String[] args) {

        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");
        // Using Stream flatMap(Function mapper)
        list.stream().flatMap(str ->
                Stream.of(str.charAt(2))).
                forEach(System.out::println);


    }
}
