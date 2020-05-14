package com.example.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examples {

    public static void main(String a[]) {

        Predicate<String> stringPredicate = s -> {
            return s.equalsIgnoreCase("adiq");
        };

        // AND logical operation
        Predicate<String> predicateAnd = stringPredicate.and(s -> s.length() > 3);
        // OR logical operation
        Predicate<String> predicateOr = stringPredicate.or(s -> s.length() < 4);
        System.out.println(predicateOr.test("ad"));


        Predicate<Integer> positive=i->i>0;
        List<Integer> integerList= Arrays.asList(
                new Integer(1),
                new Integer(100),
                new Integer(-9),
                new Integer(-1)
        );

        List<Integer> filterList=filterList(integerList,positive);
        filterList.forEach(System.out::println);

    }

    public static List<Integer> filterList(List<Integer> intList,Predicate<Integer> integerPredicate){

        List<Integer> filteredList=new ArrayList<>();
        for (Integer i:intList){
            if(integerPredicate.test(i)){
                filteredList.add(i);
            }
        }
        return filteredList;
    }
}
