/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.mapFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemoTwo {

    public static void main(String[] args) {

        List<StaffPublic> staff = Arrays.asList(
                new StaffPublic("mkyong", 30, "something"),
                new StaffPublic("jack", 27, "something"),
                new StaffPublic("lawrence", 33, "okay")
        );

        //Before Java 8
        List<String> result = new ArrayList<>();
        for (StaffPublic x : staff) {
            result.add(x.getName());
        }
        System.out.println(result); //[mkyong, jack, lawrence]

        //Java 8
        List<String> collect = staff.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(collect); //[mkyong, jack, lawrence]

    }
}
