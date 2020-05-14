/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.functionalCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalDemo {

    public static void main(String a[]) {

        List<Person> people = Arrays.asList(new Person("Adarsha", Gender.MALE)
                , new Person("Adarsha", Gender.MALE)
                , new Person("Sowjanya", Gender.FEMALE)
                , new Person("Vidya", Gender.FEMALE)
                , new Person("Sahana", Gender.MALE));


        System.out.println("Imperative appraoch");
        List<Person> females = new ArrayList<>();

        for (Person f : people) {
            if (Gender.FEMALE.equals(f.gender)) {
                females.add(f);
            }
        }
        for (Person fem : females) {
            System.out.println(fem);

        }

        System.out.println("Declarative appraoch");

        Predicate<Person> femalePred = fem -> Gender.FEMALE.equals(fem.gender);

        people.stream().filter(femalePred)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
