/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread.threadlocal;

public class MyObject {
    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.printf("MyObject name: %s, thread: %s%n", name,
                Thread.currentThread().getName());
    }
}

