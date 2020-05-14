/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.interview;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }

        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        System.out.println(listWithoutDuplicates);


        // ArrayList with duplicate elements
        ArrayList<Integer> numbersListList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        System.out.println(numbersList);
        List<Integer> listWithoutDuplicatesList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
        Set<Integer> result = findDuplicateBySetAdd(list);
        result.forEach(System.out::println);

    }

    private static Set<Integer> findDuplicateBySetAdd(List<Integer> list) {
        Set<Integer> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
    }


}



