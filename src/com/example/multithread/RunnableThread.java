/*
 * Copyright (c) 2020 Astar Solutions - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential . Written by Team Astar ,2020
 */

package com.example.multithread;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("In run method; thread name is: " +
                Thread.currentThread().getName());
    }

    public static void main(String args[]) throws Exception {

        Thread myThread = new Thread(new RunnableThread());
        myThread.start();
        System.out.println("In main method; thread name is: " +
                Thread.currentThread().getName());
    }
}
