package com.example.streams;

import com.example.serialization.Employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBuilders {

    public static void main(String a[]) {

        Stream<Integer> intStream = Stream.of(12, 23, 43, 2, 24, 56);
        intStream.forEach(z -> System.out.println(z));

        System.out.println("---------------");

        Stream<Integer> arrStream = Stream.of(new Integer[]{12, 34, 56, 23, 2, 2, 13, 4});
        arrStream.forEach(x -> System.out.println(x));

        System.out.println("---------------");

        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            intList.add(i);

        }
        Stream<Integer> streamList = intList.stream();
        streamList.forEach(w -> System.out.println(w));

        System.out.println("---------------");

        Stream<Date> dateStream = Stream.generate(() -> {
            return new Date();
        }).limit(2);
        dateStream.forEach(d -> System.out.println(d));

        System.out.println("---------------");

        IntStream chrStream = "12345ABCD_efgh".chars();
        chrStream.forEach(f -> System.out.println(f));


        System.out.println("---------------\nConvert Stream to List");

        Stream<Integer> listStream = intList.stream();
        List<Integer> evenNumList = listStream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumList);


        System.out.println("---------------\nConvert Stream to array");

        Stream<Integer> streamArr = intList.stream();
        Integer[] oddNumberArr = streamArr.filter(i -> i % 2 != 0).toArray(Integer[]::new);
        Arrays.stream(oddNumberArr).forEach(System.out::print);

        System.out.println("---------------\nConvert Stream to array");
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Adarsha");
        memberNames.add("Salman");
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");


        // Intermediate Operations

        memberNames.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

        System.out.println("************");

        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("**************");
        List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);

        System.out.println("**************");

        boolean matchResult = memberNames.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);

        matchResult = memberNames.stream().allMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);

        matchResult = memberNames.stream().noneMatch(s -> s.startsWith("A"));
        System.out.println(matchResult);

        System.out.println("**************");

        long totalMatchedCount = memberNames.stream().filter(s -> s.startsWith("A")).count();

        System.out.println(totalMatchedCount);

        System.out.println("**************");

        String firstFind = memberNames.stream().filter(s -> s.startsWith("A")).findFirst().get();

        System.out.println(firstFind);

        System.out.println("--------------------\n ifelse Example");

        List<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,0,77));

        Consumer<Integer> intConsumerAction = integer -> {

            if (integer % 2 == 0) {
                System.out.println("eve number :" + integer);
            } else {
                System.out.println("odd number :" + integer);
            }
        };
        numList.stream().forEach(intConsumerAction);


        Integer maxNum=Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("Max Number : "+maxNum);
        System.out.println("Min Number : "+minNumber);


        // Get Min or Max String/Char
        String maxChar = Stream.of("H", "T", "D", "I", "J")
                .max(Comparator.comparing(String::valueOf))
                .get();

        String minChar = Stream.of("H", "T", "D", "I", "J")
                .min(Comparator.comparing(String::valueOf))
                .get();

        System.out.println("maxChar = " + maxChar);
        System.out.println("minChar = " + minChar);


        System.out.println("--------------------------");

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Lokesh", 36));
        employees.add(new Employee(2, "Alex", 2));
        employees.add(new Employee(3, "Brian", 52));

        Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );


        // Get Min or Max Object
        Employee minObject = employees.stream().min(comparator).get();
        Employee maxObject = employees.stream().max(comparator).get();

        System.out.println("minObject = " + minObject);
        System.out.println("maxObject = " + maxObject);


        System.out.println("------------------------");

        long count = Stream.of("how","to","do","in","java").count();
        System.out.printf("There are %d elements in the stream %n", count);

        count = IntStream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.printf("There are %d elements in the stream %n", count);

        count = LongStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).count();
        System.out.printf("There are %d elements in the stream %n", count);

        System.out.println("------------------------\n Collectors counting() function");


        long countt = Stream.of("how","to","do","in","java").collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", countt);

        countt = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", countt);

        countt = Stream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 == 0).collect(Collectors.counting());
        System.out.printf("There are %d elements in the stream %n", countt);





    }

}
