/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

/*
    You override the run() method but invoke the start() method.
    Why can’t you directly call the run() method? If you
    change the previous program by only changing myThread.start() to myThread.run(),
    what will happen?
*/

public class MyThreadTwo implements Runnable {

/*    When you call the start() method, the thread gets
    scheduled and the run() method is invoked by the JVM when it is time to execute that thread.*/

    @Override
    public void run() {
        System.err.println("In run method; thread name is:" + Thread.currentThread().getName());
    }

    public static void main(String args[]) throws Exception {

        Thread t1 = new Thread(new MyThreadTwo());
        t1.run();
        System.out.println("In main method; thread name is : " +
                Thread.currentThread().getName());


    }
}
