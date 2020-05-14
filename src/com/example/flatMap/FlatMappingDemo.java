/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMappingDemo {

/*    How flatMap() works :
     { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}

     The function you pass to stream.flatMap returns a stream for each object.
     That means the function can return any number of objects for each input object (including none).
     The resulting streams are then concatenated to one output stream.

     Stream flatMap(Function mapper) returns a stream consisting of the results of replacing each
     element of this stream with the contents of a mapped stream produced by applying the
     provided mapping function to each element.

     */


    public static void main(String... args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("five", "six"),
                Arrays.asList("three", "four")
        );

        List<String> result = listOfLists.stream()
                .flatMap(childList -> childList.stream())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
