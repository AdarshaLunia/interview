/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class SimpleThread {

    public static void main(String[] s) {
        Thread t = new Thread();
        System.out.println(t);

        Thread t1 = new Thread();
        t1.setName("SimpleThread");
        t1.setPriority(9);
        System.out.println(t1);
    }
}
