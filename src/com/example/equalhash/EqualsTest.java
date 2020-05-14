/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.equalhash;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

    public static void main(String[] args) {
        Team t1 = new Team();
        Team t2 = new Team();

        t1.setId(100);
        t2.setId(100);
        System.out.println(t1.equals(t2)); // false if we not override equals method


        Set<Team> employees = new HashSet<Team>();
        employees.add(t1);
        employees.add(t2);

        System.out.println(employees.size());  //Prints two objects if we are not override hashcode
    }
}
