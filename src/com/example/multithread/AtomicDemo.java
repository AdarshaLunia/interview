/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {

        AtomicInteger atomicInteger=new AtomicInteger(100);
        System.out.println(atomicInteger.addAndGet(2));    //102
        System.out.println(atomicInteger);                      //102

        System.out.println(atomicInteger.getAndAdd(2));   //102
        System.out.println(atomicInteger);                      //104

        System.out.println(atomicInteger.incrementAndGet());    //105
        System.out.println(atomicInteger);                      //105

        System.out.println(atomicInteger.getAndIncrement());    //105
        System.out.println(atomicInteger);                      //106

        System.out.println(atomicInteger.decrementAndGet());    //105
        System.out.println(atomicInteger);                      //105

        System.out.println(atomicInteger.getAndDecrement());    //105
        System.out.println(atomicInteger);                      //104
    }
}
