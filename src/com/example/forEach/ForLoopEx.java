package com.example.forEach;

import java.util.Arrays;
import java.util.List;

public class ForLoopEx {


    public static void main(String a[]) {

        List<String> names = Arrays.asList("Sample", "Adarsha", "Adhiti", "Ashik");


        //external iteration

        for (String str : names) {
            System.out.println(str);
        }


        //Internal Iteration
        names.forEach(str -> System.out.println(str.toUpperCase()));

        //Method Reference using ::

        names.forEach(System.out::println);


        names.forEach(ForLoopEx::toConvertPrint);

    }

    public static void toConvertPrint(String a) {

/*
        The lambda expression in this code calls toUpperCase() method on the
        given String object. Since
        method references just route the parameters, so you cannot use
        them directly for simplifying this lambda
        expression. An alternative is to put this code inside a method and
        use the reference of that method
*/

        System.out.println(a.toLowerCase());

    }


}
