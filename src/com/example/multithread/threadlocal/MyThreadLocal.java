/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread.threadlocal;

public class MyThreadLocal {

    private static final ThreadLocal<MyObject> threadLocal = new ThreadLocal<>();

    public static MyObject createMyObject(String name) {
        MyObject myObject = new MyObject(name);
        threadLocal.set(myObject);
        return myObject;
    }

    public static MyObject getMyObject() {
        return threadLocal.get();
    }
}


