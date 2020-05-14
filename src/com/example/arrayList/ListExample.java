package com.example.arrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {

    public static void main(String a[]) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("Java");
        /* for(String language : languageList) {
            System.out.println(language);
        }*/

        // Iterator

        for (Iterator<String> langIter = languageList.iterator(); langIter.hasNext(); ) {
            String strLang = langIter.next();
            System.err.println(strLang);
        }


        ListIterator<String> defendersListIterator = languageList.listIterator();
        System.out.println("Modified List backwards:\n");
        while (defendersListIterator.hasPrevious()) {
            System.out.println(defendersListIterator.previous());
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            nums.add(i);
            System.out.println("Orginal List :" + nums);
        }

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("List after removing all elements" + nums);

        Double[] bitchCount = {12.12, 13.99, 43.45, 55.55, 1.3};
        System.out.println("The original array is: " + Arrays.toString(bitchCount));

        List<Double> doubleList = Arrays.asList(bitchCount);
        doubleList.set(0, 10.00);
        System.out.println("The modified array is: " + Arrays.toString(bitchCount));

        /*  Fail-safe iterators means they will not throw any exception even if
            the collection is modified while iterating over it.

              Whereas Fail-fast iterators throw an exception(ConcurrentModificationException)
              if the collection is modified while iterating over it.
        */


        List<Integer> integers = new CopyOnWriteArrayList<>(); // ArrayList<>() ;
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Iterator<Integer> itr = integers.iterator();
        while (itr.hasNext()) {
            Integer it = itr.next();
            integers.remove(it);
        }

    }


}
