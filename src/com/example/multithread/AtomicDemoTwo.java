/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemoTwo {

    /*  The primary use of AtomicInteger is when we are in multi-threaded context and
        we need to perform atomic operations on an int value without using synchronized keyword.
        Using the AtomicInteger is equally faster and more readable than performing the same using synchronization.
   */
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(100);
        boolean isSuccess = atomicInteger.compareAndSet(100, 110);   //current value 100
        System.out.println(isSuccess);      //true
        isSuccess = atomicInteger.compareAndSet(100, 120);       //current value 110
        System.out.println(isSuccess);      //false

    }
}
