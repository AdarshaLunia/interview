/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.example.predicates.PredicateDemo.Person.showPersons;

public class PredicateDemo {

    public static void main(String... args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mark Zuckerberg", 33, "M"));
        personList.add(new Person("Bill Gates", 62, "M"));
        personList.add(new Person("Marissa Mayer", 42, "F"));
        personList.add(new Person("Satya Nadella", 50, "M"));
        personList.add(new Person("Sundar Pichai", 45, "M"));
        personList.add(new Person("Sergey Brin", 44, "M"));
        personList.add(new Person("Larry Page", 45, "M"));

        Predicate<Person> isFemale = (p) -> p.gender.equals("F");
        Predicate<Person> isYoung = (p) -> p.age <= 35;
        Predicate<Person> isAged = (p) -> p.age >= 45;

        System.out.println("Female persons: ");
        showPersons(personList, isFemale);

        System.out.println("Young persons: ");
        showPersons(personList, isYoung);

        System.out.println("Aged persons: ");
        showPersons(personList, isAged);
    }

    static class Person {
        String name;
        int age;
        String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        public static void showPersons(List<Person> list, Predicate<Person> condition) {
            for (Person p : list)
                if (condition.test(p)) System.out.println(p.toString());
        }
    }
}
