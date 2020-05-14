/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparator {

    static Comparator<Student> compareByFirstName = Comparator.comparing(Student::getFirstName);
    static Comparator<Student> compareByLastName = Comparator.comparing(Student::getLastName);

    //Compare by first name and then last name (multiple fields)
    Comparator<Student> compareByFullName = compareByFirstName.thenComparing(compareByLastName);

    private static ArrayList<Student> getUnsortedEmployeeList() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("2", "Lokesh", "Gupta"));
        list.add(new Student("1", "Alex", "Gussin"));
        list.add(new Student("4", "Brian", "Sux"));
        list.add(new Student("5", "Neon", "Piper"));
        list.add(new Student("6", "David", "Beckham"));
        list.add(new Student("8", "Alex", "Beckham"));
        list.add(new Student("9", "Brian", "Suxena"));
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Student> employees = getUnsortedEmployeeList();

        //Compare by first name and then last name
        Comparator<Student> compareByName = Comparator
                .comparing(Student::getFirstName)
                .thenComparing(Student::getLastName);

        //Compare by first name and then last name (multiple fields)
        Comparator<Student> compareByFullName = compareByFirstName.thenComparing(compareByLastName);
        Collections.sort(employees, compareByFullName);

        System.out.println(employees);

    }
}
