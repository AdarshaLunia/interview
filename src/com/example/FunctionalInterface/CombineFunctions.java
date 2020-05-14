package com.example.FunctionalInterface;

import java.util.Arrays;
import java.util.function.Function;

public class CombineFunctions {

    public static void main(String s[]){
        Function<String ,Integer> parseInt=Integer::parseInt;
        Function<Integer,Integer> absInt=Math::abs;
        Function<String,Integer> parseIntAbs=parseInt.andThen(absInt);


        Arrays.stream("4, -9, 16, 8".split(", "))
                .map(parseIntAbs)
                .forEach(System.out::println);

    }
}
