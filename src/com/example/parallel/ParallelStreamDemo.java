/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.parallel;

import java.util.stream.Stream;

public class ParallelStreamDemo {

/*
    Let’s take a scenario where you have a list of employee objects and you have to count
    the employees whose salary is above 15000. Generally, to solve this problem you will iterate
    over list going through each employee and checking if employee’s salary is above 15000.
    This takes O(N) time since you go sequentially.

    Streams give us the flexibility to iterate over the list in a parallel pattern
    and can give the total in quick fashion. Stream implementation in Java is by default
    sequential unless until it is explicitly mentioned in parallel. When a stream executes in
    parallel, the Java runtime partitions the stream into multiple sub-streams.
    Aggregate operations iterate over and process these sub-streams in parallel and then combine
    the results.
*/

    public static void main(String a[]) {
        Stream.of("John", "Mike", "Ryan", "Donald", "Matthew").forEach(System.out::println);

        // Whereas, the order is not guaranted while using parallel stream.

        // Operations on sequential streams are performed on a single thread while operations on
        // parallel streams are performed concurrently on multiple threads.

        System.err.println("---------------");
        Stream.of("John", "Mike", "Ryan", "Donald", "Matthew").parallel().forEach(System.out::println);
    }
}
