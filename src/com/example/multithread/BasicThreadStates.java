/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class BasicThreadStates extends Thread {
    public static void main(String[] s) throws Exception {
        Thread t = new Thread(new BasicThreadStates());
        System.out.println("Just after creating thread; \n" +
                " The thread state is: " + t.getState());
        t.start();
        System.out.println("Just after calling t.start(); \n" +
                " The thread state is: " + t.getState());
        t.join();
        System.out.println("Just after main calling t.join(); \n" +
                " The thread state is: " + t.getState());
    }
}
