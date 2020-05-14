/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class MyThreadOne extends Thread {
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();

                // ignore the InterruptedException - this is perhaps the one of the
                // very few of the exceptions in Java which is acceptable to ignore
        }
        System.out.println("In run method; thread name is: " + getName());
    }

    public static void main(String args[]) {
        Thread myThread = new MyThreadOne();
        myThread.start();
        System.out.println("In main method; thread name is: " +
                Thread.currentThread().getName());
    }
}
