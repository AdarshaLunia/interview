package com.example.Consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerMain {

    public static void main(String arr[]) {
        Consumer<String> stringConsumers = str -> System.out.println(str.toUpperCase());
        stringConsumers.accept("Adarsha");


        // Consumer to multiply 2 to every integer of a list

        Consumer<List<Integer>> consumerModify = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
            }
        };

        Consumer<List<Integer>> listConsumer = list -> list.stream().forEach(a -> System.out.println(a + ""));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        // consumerModify.accept(list);
        // listConsumer.accept(list);

        /* Consumer also has a default method named andThen(); it allows chaining calls to Consumer objects.

         using addThen()
         */
        consumerModify.andThen(listConsumer).accept(list);

        System.out.println("*********************");

        Stream<String> s = Stream.of("Adarsha", "Ramya");
        Consumer<String> c = System.out::println;
        s.forEach(c);
    }
}
