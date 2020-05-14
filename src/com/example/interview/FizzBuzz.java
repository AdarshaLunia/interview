/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzzInJava8(10);
        fizzBuzzBeforeJava8(10);
    }

    private static void fizzBuzzInJava8(int num) {
        IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.err::println);
    }

    private static void fizzBuzzBeforeJava8(int num) {
        for (int i = 1; i <= num; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
    }
}
