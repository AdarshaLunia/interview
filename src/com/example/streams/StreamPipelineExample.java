package com.example.streams;

import java.util.Arrays;

public class StreamPipelineExample {

    public static void main(String a[]){
        Arrays.stream(Object.class.getMethods())
                .map(method -> method.getName())
                .distinct()
                .forEach(System.out::println);
    }
}
