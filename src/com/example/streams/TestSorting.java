package com.example.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sorting");

        for (Developer developer:listDevs){
            System.out.println(developer);
        }


/*        //Sort By Age
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //sort by name
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        //Java 8 Method
        listDevs.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("After Sorting");
        for (Developer developer:listDevs){
            System.out.println(developer);
        }

        //Lambda
        listDevs.sort((Developer d1,Developer d2)->d1.getAge()-d2.getAge());

        //lambda, valid, parameter type is optional
        listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));

        listDevs.forEach((developer -> System.err.println(developer)));


        //Lambda expression to sort a List using their salary.
        Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
        listDevs.sort(salaryComparator.reversed());
        listDevs.forEach((developer -> System.out.println(developer)));

    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }

    private static class Developer {

        private String name;
        private BigDecimal salary;
        private int age;

        public Developer(String name, BigDecimal salary, int age) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
    }
}
